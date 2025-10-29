package nf1.fullstack.arquictectures.hexagonal3.domain;

import nf1.fullstack.arquictectures.hexagonal3.application.ProductRepository;

import java.util.List;
import java.util.Objects;

public class ProductService2 {
    private final ProductRepository repository;

    public ProductService2(ProductRepository repository) {
        this.repository = Objects.requireNonNull(repository);
    }

    public List<Product2> getProductList() {
        return repository.findAll();
    }

    public Product2 addProduct(String nom, float preu) {
        Product2 product = new Product2(nom, preu);
        return repository.save(product);
    }
}
