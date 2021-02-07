package com.onAir;
/*
 *Creer un programme qui demande a l'utilisateur de renter une commande.
 * Si il appuie sur entrez sans rien ecrire redemander uen commande
 * Si il entre start quelle que soit les majuscule minuscule renvoyer " app Start ..."
 * Si il entre 'stop'  quelle que soit les majuscule minuscule renvoyer "machine stop ..."
 * Si il entre "quit" renvoyer "exit ...." et quitter le programme.
 * toute autre enter renvoie "entrez non reconnues.
 *
 * utilser string lenght pour determiner l'enter null
 * utiliser des switch et transformer le user input en upper Case
 */

import java.util.Scanner;

public class A21_StringExercices {
    public static void main(String[] args) {

        boolean running = true;
        Scanner input = new Scanner(System.in);

        while (running) {
            System.out.print("enter a command : ");
            String userInput = input.nextLine();
            userInput = userInput.toUpperCase();

            if (userInput.length() == 0) {
                continue;
                //continue va renvoyer au debut de la boucle
            }
            switch (userInput) {
                case "QUIT" -> {
                    System.out.println("exit ...");
                    running = false;
                }
                case "START" -> { System.out.println("Machine starting .."); }
                case "STOP" -> { System.out.println("Machine stop .."); }
                default -> System.out.println("invalid entries");
            }
        }
        input.close();

    }
}
