package main;

import config.ProjectConfig;
import models.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductRepository productRepository = context.getBean(ProductRepository.class);

//            Product product = new Product();
//            product.setName("RB19");
//            product.setPrice(1347342410.85);
//
//            productRepository.addProduct(product);

            List<Product> products = productRepository.getProducts();
            products.forEach(System.out::println);
        }
    }

}
