package aprendiendo.api.backend.model.errors.validation;

import aprendiendo.api.backend.model.entity.ProductEntity;
import aprendiendo.api.backend.model.errors.ModelErrorsMessages;

public class ValidationInputs {

    public static Boolean validationFields(ProductEntity product) {

        if (product.getNameProduct().equals(" ") || product.getNameProduct() == null) {
            return false;
        }

        if (product.getDescriptionProduct().equals(" ") || product.getDescriptionProduct() == null) {
            return false;
        }
        return true;
    }
}
