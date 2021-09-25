package com.bridgelabz.oop;

import com.bridgelabz.utility.MyLinkedList;
import java.io.BufferedReader;
import java.util.Scanner;

public class Utility{
static MyLinkedList<Stock> list;

public static void getStockData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of stocks: ");
        int count = scanner.nextInt();
        list = new MyLinkedList<Stock>();

        for(int i = 0; i < count; i++) {
                System.out.print("Enter stock name, number of shares and share price: ");
                String name = scanner.next();
                int numberOfShares = scanner.nextInt();
                int price = scanner.nextInt();
                Stock stock = new Stock(name, numberOfShares, price);
                list.add(stock);
        }
                scanner.close();
}


public static void printReport() {
        int totalValue = 0;
        System.out.println("\nName\tShares\tPrice\tValue");
        
        while(!list.isEmpty()) {
                Stock stocks = list.pop(0);
                totalValue += stocks.getValue();
                System.out.println(stocks.getName() + "\t" + stocks.getNumberOfShares() + "\t" + stocks.getPrice() + " \t" + stocks.getValue());
        }
                System.out.println("\nTotal value is: " + totalValue);
        }
        BufferedReader bufferedReader = null;


}
