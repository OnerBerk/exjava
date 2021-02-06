package com.onAir;

public class A16_DoWhileLoop {
    public static void main(String[] args) {
        // do va executé une fois quand la condition est false
        int count = 0;

        System.out.println("first loop");
        do {
            System.out.println("hello count : " + count);
        } while (count++ < 5);

        System.out.println("\nsecond loop");
        count=0;
        do {
            System.out.println("hello count 2 : " + count);
        } while (count > 12);
    }
}
