package com.onAir;

import java.util.Scanner;

public class A18_VariablesScope {
    public static void main(String[] args) {

        final String USER_PASSWORD = "abcde";

        Scanner input = new Scanner(System.in);
        String password = null;
        //password est decalrer dans le scope globale

        do {

            System.out.print("enter your Passsword > :");
            password = input.nextLine();

        } while (!password.equals(USER_PASSWORD));

        input.close();
        System.out.print("Welcome Home");
    }
}
