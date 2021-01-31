package com.onAir;

import java.util.Scanner;

/**
 * condition simple avec un if
 */

public class A08_If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("veuillez entrez la temperature de la piece (F) :");

        int fahrenheit = input.nextInt();
        input.close();
        double celsius = (fahrenheit - 32) * 5.5 / 9.0;
        System.out.printf("%.2f° celsius\n", celsius);


        if (celsius <= 15) {
            System.out.println("il caille!");
        } else {
            System.out.println("la temperature est correcte ");
        }
    }
}
