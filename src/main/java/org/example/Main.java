package org.example;

public class Main {
    public static void main(String[] args) {

ShopRepository repo = new ShopRepository();
Product product1 = new Product(1, "Книга",100);
Product product2 = new Product(2, "Журнал",200);
Product product3 = new Product(3, "Газета",300);
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        Product [] book = repo.findAll();

        System.out.println(book);
    }
}