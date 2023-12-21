package aprendiendo.api.backend.controller;

import aprendiendo.api.backend.model.entity.ProductEntity;
import aprendiendo.api.backend.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> createProduct(@RequestBody ProductEntity product) {
        return iProductService.createProduct(product);
    }

    @GetMapping("/getById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> getByID(@PathVariable("id") Long id) {
        return iProductService.getProductById(id);
    }
}
