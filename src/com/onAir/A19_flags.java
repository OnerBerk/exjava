package com.onAir;

import java.util.Scanner;

public class A19_flags {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean codeEntered = false;
        //les flag sont souve,t des variable boolean qui permette de controler une partis du programme
        // dans ce cas on check si un certains mot à été ecrit ou non

        for (; ; ) {
            System.out.print(">");
            String inputWord = input.nextLine();

            if (inputWord.equals("quit")) {
                break;
            } else if (inputWord.equals("berki")) {
                codeEntered = true;
            }
        }
        input.close();
        if (codeEntered) {
            System.out.println("word is entered");
        } else {
            System.out.println("word is not entered");
        }

    }
}
