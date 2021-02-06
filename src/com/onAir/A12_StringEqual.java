package com.onAir;

public class A12_StringEqual {
    public static void main(String[] args) {
        String texte1 = "orange";
        String texte2 = "orange";

        System.out.println("les String sont identique: " + texte2.equals(texte1));
        //preferer la foctions equals plutot que les == pour comparer des string
    }
}
