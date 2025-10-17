package nf1.fullstack.arquictectures.mvc3.model;

import java.util.List;

public class ProductService {
    List<Product> productList;

    public ProductService(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }
}
