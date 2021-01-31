package com.onAir;

public class A07_PostEtPreIncr {
    /**
     *exercices pour comprendre le l'incrementation et decrementation
     * post et pre declaration
     */

    public static void main(String[] args) {
        int otarie = 5;
        int elephants = 3;
        int girafes =10;

        int animales = --elephants + ++otarie + girafes++ + elephants;
                        // 2 + 6 + 10 + 3

        System.out.printf("animales : %d\n ", animales);

    }
}
