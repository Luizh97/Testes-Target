package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string;

        System.out.print("Informe a String: ");
        string = sc.nextLine();

        String stringInvertida = invertString(string);

        System.out.print("String invertida: " + stringInvertida);
    }

    private static String invertString(String string) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = string.length() - 1; i >= 0; i--){
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

}