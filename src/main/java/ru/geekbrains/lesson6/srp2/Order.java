package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class Order {

    private static String clientName;

    private static String product;

    private static int qnt;

    private static int price;
    public Order(){
    }
      public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }


    public static String getClientName() {
        return clientName;
    }

    public static String getProduct() {
        return product;
    }

    public static int getQnt() {
        return qnt;
    }

    public static int getPrice() {
        return price;
    }

 }
