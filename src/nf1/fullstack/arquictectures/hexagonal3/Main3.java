package nf1.fullstack.arquictectures.hexagonal3;

import nf1.fullstack.arquictectures.hexagonal3.application.MainController2;
import nf1.fullstack.arquictectures.hexagonal3.domain.ProductService2;
import nf1.fullstack.arquictectures.hexagonal3.infraestucture.adapter.InMemoryProductRepsitoryAdapter;

public class Main3 {
    public static void main(String[] args) {
        InMemoryProductRepsitoryAdapter repo = new InMemoryProductRepsitoryAdapter();
        ProductService2 service = new ProductService2(repo);
        MainController2 controller = new MainController2(service);
        controller.start();

    }
}
