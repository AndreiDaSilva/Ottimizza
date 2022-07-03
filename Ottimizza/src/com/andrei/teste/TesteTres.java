package com.andrei.teste;

public class TesteTres {

    public static int procurarMaiorValor(int[] numeros) {
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        System.out.println(procurarMaiorValor(new int[]{334,568,123,796,255}));
    }
}