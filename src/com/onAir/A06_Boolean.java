package com.onAir;

public class A06_Boolean {
    public static void main(String[] args) {
        boolean condition = false;
        System.out.println("condition est :" + condition);

        boolean condition1 = 4 < 5;
        System.out.println("condition est :" + condition1);

        boolean condition2 = 8 < 5;
        System.out.println("condition est :" + condition2);

        int chat = 42;
        int chien =42;
        System.out.printf("le nombre de chat est egale au nombre de chien : %b\n", chat==chien);
        // ne pas utiliser le == avec le type double
    }
}
