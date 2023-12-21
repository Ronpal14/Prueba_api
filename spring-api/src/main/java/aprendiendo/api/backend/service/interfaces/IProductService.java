package aprendiendo.api.backend.service.interfaces;

import aprendiendo.api.backend.model.entity.ProductEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    ResponseEntity<?> createProduct(ProductEntity product);

    ResponseEntity<Object> getProductById(Long id);
}
