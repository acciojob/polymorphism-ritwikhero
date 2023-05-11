package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        int result1 = p.product(2,3);
        System.out.println(result1);
    }
    public static class Product {
//        int x;
//        int y;

        public int product(int x, int y) {
           return x*y;
        }
    }
}
