package nf1.fullstack.arquictectures.mvc3.controller;

import nf1.fullstack.arquictectures.mvc3.model.Product;
import nf1.fullstack.arquictectures.mvc3.model.ProductService;
import nf1.fullstack.arquictectures.mvc3.view.MainView;

public class MainController {
    MainView view;
    ProductService service;

    public MainController(MainView view, ProductService service) {
        this.view = view;
        this.service = service;
    }

    private void readOptionMenu() {
        int opcio;
        while((opcio = view.showMenu()) != 0) {
            switch (opcio) {
                case 1 -> nouProducte();
                case 2 -> llistatProductes();
                default -> System.out.println("opció invàllida");
            }
        }
    }

    private void nouProducte() {
        Product p = view.getDataProduct();
        service.addProduct(p);
    }

    private void llistatProductes() {
        view.showProducts(service.getProductList());
    }

    public void start() {
       readOptionMenu();
    }
}
