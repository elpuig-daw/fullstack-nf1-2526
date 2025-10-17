package nf1.fullstack.arquictectures.mvc3.view;

import nf1.fullstack.arquictectures.mvc3.model.Product;

import java.util.List;
import java.util.Scanner;

public class MainView {
    private Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. Nou producte");
        System.out.println("2. Llista de productes");
        System.out.println("0. Sortir");
        return Integer.parseInt(sc.nextLine());
    }

    public Product getDataProduct() {
        System.out.print("Nom producte: ");
        String name = sc.nextLine();
        System.out.print("Preu producte: ");
        float preu = sc.nextFloat();
        sc.nextLine();
        return new Product(name, preu);
    }

    public void showProducts(List<Product> productList) {
        productList.forEach(System.out::println);
    }
}
