package com.ps.ec;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            return -1;
        }
    }
}
