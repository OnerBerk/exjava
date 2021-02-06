package com.onAir;
import java.util.Scanner;

public class A15_EnterPasword {
    public static void main(String[] args) {

        final String USER_PASSWORD = "abcde";

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("enter your Passsword > :");
            String password = input.nextLine();

            if (password.equals(USER_PASSWORD)) {
                System.out.println("welcome home");
                break;
            } else {
                System.out.println("access denied");
            }
        }
        input.close();
    }
}
