package aprendiendo.api.backend.service.implementInterface;

import aprendiendo.api.backend.model.entity.ProductEntity;
import aprendiendo.api.backend.model.errors.ModelErrorsMessages;
import aprendiendo.api.backend.model.errors.validation.ValidationInputs;
import aprendiendo.api.backend.model.repository.IProductEntityRepository;
import aprendiendo.api.backend.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;

@Service
public class ProductServiceImplementation implements IProductService {

    @Autowired
    private IProductEntityRepository iProductEntityRepository;

    @Override
    public ResponseEntity<?> createProduct(ProductEntity product) {

        ModelErrorsMessages modelErrorsMessages = new ModelErrorsMessages();

        if (ValidationInputs.validationFields(product)) {
             return ResponseEntity.ok().body(iProductEntityRepository.save(product));
        }

        modelErrorsMessages.setMessage("Los campos estan vacios o nulos");
        modelErrorsMessages.setHttpStatus(HttpStatus.BAD_REQUEST);
        modelErrorsMessages.setHttpStatusCode(HttpStatusCode.valueOf(400));
        //modelErrorsMessages.setDate();

        return ResponseEntity.badRequest().body(modelErrorsMessages);
    }

    @Override
    public ResponseEntity<Object> getProductById(Long id) {

        Optional<ProductEntity> productEntityOptional = iProductEntityRepository.findById(id);
        ModelErrorsMessages modelErrorsMessages = new ModelErrorsMessages();


        if (productEntityOptional.isPresent()) {
            return ResponseEntity.ok().body(productEntityOptional.get());
        }

        modelErrorsMessages.setMessage("El producto con el id: " + id + " no existe en la base de datos");
        modelErrorsMessages.setHttpStatus(HttpStatus.BAD_REQUEST);
        modelErrorsMessages.setHttpStatusCode(HttpStatusCode.valueOf(400));

        return ResponseEntity.badRequest().body(modelErrorsMessages);
    }
}
