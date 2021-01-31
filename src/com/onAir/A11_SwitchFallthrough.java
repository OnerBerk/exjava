package com.onAir;

import java.util.Scanner;

public class A11_SwitchFallthrough {
    public static void main(String[] args) {
        System.out.println(" voulez vous proceder (y/n): ");

        Scanner input = new Scanner(System.in);
        String choix = input.nextLine();
        input.close();

        switch (choix) {
            case "y" -> { System.out.println("processing..."); }
            case "n" -> { System.out.println("exit..."); }
            default -> {System.out.println("Choix invalide");}
        }
    }
}
