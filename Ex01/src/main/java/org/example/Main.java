package org.example;

public class Main {
    public static void main(String[] args) {
        int  soma = 0, k = 0;
         for(int indice = 13; k < indice; k++){
             k += 1;
             soma += k;
         }
        System.out.println(soma);
    }
}

//        int INDICE = 13, SOMA = 0, K = 0;
//
//enquanto K < INDICE faça
//
//{
//
//    K = K + 1;
//
//    SOMA = SOMA + K;
//
//}
//
//imprimir(SOMA)