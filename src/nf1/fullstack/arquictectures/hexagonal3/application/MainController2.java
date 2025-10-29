package nf1.fullstack.arquictectures.hexagonal3.application;

import nf1.fullstack.arquictectures.hexagonal3.domain.Product2;
import nf1.fullstack.arquictectures.hexagonal3.domain.ProductService2;

import java.util.Scanner;

public class MainController2 {
    private Scanner sc = new Scanner(System.in);
    private final ProductService2 service;

    public MainController2(ProductService2 service) {
        this.service = service;
    }

    public int showMenu() {
        System.out.println("1. Nou producte");
        System.out.println("2. Llista de productes");
        System.out.println("0. Sortir");
        return Integer.parseInt(sc.nextLine());
    }

    public void nouProducte() {
        System.out.print("Nom producte: ");
        String name = sc.nextLine();
        System.out.print("Preu producte: ");
        float preu = sc.nextFloat();
        sc.nextLine();
        Product2 p = service.addProduct(name, preu);
        System.out.println(p.nom() + " creat/da!");
    }

    public void llistatProductes() {
        service.getProductList().forEach(System.out::println);
    }

    public void start() {
        int opcio;
        while((opcio = showMenu()) != 0) {
            switch (opcio) {
                case 1 -> nouProducte();
                case 2 -> llistatProductes();
                default -> System.out.println("opció invàllida");
            }
        }
    }
}
