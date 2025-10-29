package nf1.fullstack.arquictectures.hexagonal3.infraestucture.adapter;

import nf1.fullstack.arquictectures.hexagonal3.application.ProductRepository;
import nf1.fullstack.arquictectures.hexagonal3.domain.Product2;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepsitoryAdapter implements ProductRepository {
    private final List<Product2> store = new ArrayList<>();

    @Override
    public Product2 save(Product2 product) {
        store.add(product);
        return product;
    }


    @Override
    public List<Product2> findAll() {
        return store;
    }
}
