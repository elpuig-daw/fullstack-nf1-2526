package nf1.fullstack.arquictectures.hexagonal3.application;

import nf1.fullstack.arquictectures.hexagonal3.domain.Product2;

import java.util.List;

public interface ProductRepository {
    Product2 save(Product2 product);
    List<Product2> findAll();
}
