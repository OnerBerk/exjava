package com.onAir;

import java.util.Scanner;

public class A09_Elseif {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("\t1. Hello!");
        System.out.println("\t2. Exit");
        System.out.println("\t3. Pas d'idée\n");
        System.out.println("Qu'elle est votre choix >");

        Scanner input = new Scanner(System.in);
        int choix = input.nextInt();
        input.close();

        if (choix == 1) {
            System.out.println("Salut Toi!!");
        } else if (choix == 2) {
            System.out.println("Exit...");
            System.exit(0);
        } else if (choix == 3) {
            System.out.println("je sais pas :(((");
        } else if (choix == 100) {
            System.out.println("waoooo tu m'as trouvez!!!");
        } else {
            System.out.println("t'as craqué en faite");
        }
    }
}
