package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class Order {

    private  String clientName;

    private  String product;

    private  int qnt;

    private  int price;
    public Order(){
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  String getClientName() {
        return clientName;
    }

    public  String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public  int getPrice() {
        return price;
    }

 }
