package com.onAir;
import java.util.Scanner;

/**
 * Creer un choix a faire en input et le s conditions avec switch case
 */

public class A10_Switch {
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

        switch (choix) {
            case 1 -> System.out.println("Salut Toi!!");
            case 2 -> {
                System.out.println("Exit...");
                System.exit(0);
            }
            case 3 -> System.out.println("je sais pas :(((");
            case 100 -> System.out.println("waoooo tu m'as trouvez!!!");
            default -> System.out.println("t'as craqué en faite");
        }
    }
}
