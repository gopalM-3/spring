package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class ProductDelivery {
    private final ProductRepository productRepository;

    @Autowired
    public ProductDelivery(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addNewProduct() {
        productRepository.add();
    }
}
