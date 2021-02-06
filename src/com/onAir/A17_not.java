package com.onAir;

public class A17_not {
    public static void main(String[] args) {
        System.out.println(!(4 == 5));

        int value1 = 4;
        int value2 = 5;

        if (!(value1 == value2)) {
            System.out.println("values are not equals");
        }
        if (value1 != value2) {
            System.out.println("values are not equals");
        }
    }
}
