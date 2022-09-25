package app;

public class Main {
    int a = 8;
    int b = 2;
    int c = add(a, b);
    int d = multiply(a, b);
    int e = divide(a, b);
    int f = subtract(a, b);
    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }


    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }
}
