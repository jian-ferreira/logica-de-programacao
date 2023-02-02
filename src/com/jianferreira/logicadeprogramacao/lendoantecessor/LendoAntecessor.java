package com.jianferreira.logicadeprogramacao.lendoantecessor;

import java.util.Scanner;

public class LendoAntecessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um valor inteiro: ");
        int n = sc.nextInt();

        int antecessorN = n - 1;
        System.out.println("O antecessor de " + n + " é " + antecessorN + "!");
    }
}
