package com.onAir;

import java.util.Scanner;

/*
 * creer un programme qui demande un password
 * Si le password est correcte , envoyé accés autorisé arrété le programme
 * si le password est faux redemander ke password
 * si le password est faux 3 fois , renvoyé Accés non autoris" et quitté le programme.
 *
 * utilisé une boucle for
 * utilisé un flag
 * ne pas utilisé System.exit
 */


public class A20_exercicePassword {
    public static void main(String[] args) {
        int WrongPassword = 0;
        final String PASSWORD = "abcde";
        boolean accesGranted = false;

        Scanner input = new Scanner(System.in);

        for (; ; ) {
            System.out.print("enter you password :");
            String inputPassword = input.nextLine();
            if (inputPassword.equals(PASSWORD)) {
                System.out.println("Accés autorisé , Welcome home");
                break;
            } else {
                WrongPassword = WrongPassword + 1;
                System.out.println("mauvais password ." + WrongPassword);
                if (WrongPassword == 3) {
                    System.out.println("Accés non autorisé, adieu");
                    break;
                }
            }
        }
        input.close();

    }
}

/*
 * ou
 * for (int i = 0; i < 3; i++) {
 *           System.out.print("enter you password :");
 *             String inputPassword = input.nextLine();
 *
 *           if (inputPassword.equals(PASSWORD)) {
 *                 System.out.println("Accés autorisé , Welcome home");
 *                 break;
 *             } else {
 *                 System.out.println("mauvais password .");
 *             }
 *         }
 *         input.close();
 *             if (!accesGranted) {
 *                 System.out.println("Accés non autorisé, adieu");
 *             }
 */