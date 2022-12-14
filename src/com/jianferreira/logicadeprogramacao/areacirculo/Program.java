package com.jianferreira.logicadeprogramacao.areacirculo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    private static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do raio: ");
        double area = PI * Math.pow(sc.nextDouble(), 2);

        System.out.printf("A=%.4f", area);
        sc.close();
    }
}
