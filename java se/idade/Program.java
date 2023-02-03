// Autor: Jian Ferreira
// Objetivo: Faça um algoritmo que leia a idade de uma pessoa expressa em anos e escreva a idade
// dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

package com.jianferreira.logicadeprogramacao.idade;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a idade que deseja: ");
        int idade = scanner.nextInt();
        while (idade <= 0) {
            System.out.println("A idade inserida deve ser maior que zero!");
            System.out.print("Insira a idade novamente: ");
            idade = scanner.nextInt();
        }

        int dias = Idade.calcularDias(idade);

        System.out.print("Idade em dias: " + dias);

        scanner.close();
    }
}
