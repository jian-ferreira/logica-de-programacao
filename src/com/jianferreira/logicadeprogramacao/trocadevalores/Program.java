// Autor: Jian Ferreira;
// Objetivo: Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
// A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
// valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
// nas variáveis.

package com.jianferreira.logicadeprogramacao.exercicio1;

public class Program {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // variável temporária:
        int temp = a;

        a = b;
        b = temp;

        System.out.println("A: " + a + ", B: " + b);

    }
}
