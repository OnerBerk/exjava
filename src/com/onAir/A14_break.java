package com.onAir;

public class A14_break {
    public static void main(String[] args) {
        int count = 0;

        while (true) {
            System.out.println("hello ." + count);
            if (count == 5) {
                break;
            }
            System.out.println("What's up ?");
            count++;
        }
        System.out.println("Program finished");
    }
}
