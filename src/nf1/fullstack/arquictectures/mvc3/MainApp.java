package nf1.fullstack.arquictectures.mvc3;

import nf1.fullstack.arquictectures.mvc3.controller.MainController;
import nf1.fullstack.arquictectures.mvc3.model.Product;
import nf1.fullstack.arquictectures.mvc3.model.ProductService;
import nf1.fullstack.arquictectures.mvc3.view.MainView;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        ProductService service = new ProductService(productList);
        MainView console = new MainView();
        MainController c = new MainController(console,service);
        c.start();
    }


}
