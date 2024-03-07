package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        System.out.println("Informe o valor de n para calcular o valor da sequencia de Fibonacci: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
        

    }

    private static int fibonacci(int i) {
        if(i <= 1)
            return i;

            return fibonacci(i - 1) + fibonacci(i - 2);
    }
}