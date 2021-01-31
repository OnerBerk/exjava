package com.onAir;
import java.util.Scanner;

/**
 entrez la valeur fahrenheit par l'input de la console
 */

public class A03_Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("entrez une valeur fahreinheit a convertir >");

        double fahrenheit = input.nextFloat();
        input.close();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.printf("%.1f° degrés farhrenheit font : %.2f° celsius", fahrenheit, celsius);
    }
}
