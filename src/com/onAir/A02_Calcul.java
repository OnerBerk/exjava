package com.onAir;

public class A02_Calcul {
    public static void main(String[] args) {
        /**
        faire un calcul qui convertis les fahrenheit en celsius
         */
        double fahrenheit = 91;
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.printf("%.1f° degrés farhrenheit font : %.2f° celsius", fahrenheit, celsius);
    }
}

