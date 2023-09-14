package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать приложение в рамках домашней работы,
     *  соблюдая принцип SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        InputFromConsole inputFromConsole = new InputFromConsole();
        inputFromConsole.inputFromConsole(order);
        SaveFormat save = new SaveFormat();
        save.saveToJson(order);
    }

}