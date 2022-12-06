// Autor: Jian Ferreira
// Objetivo: Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
// área do retângulo.

package com.jianferreira.logicadeprogramacao.areadoretangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Insira o altura do retângulo: ");
        double altura = scanner.nextDouble();
        double areaRetangulo = Retangulo.area(base, altura);

        System.out.printf("Área: %.2f", areaRetangulo);

        scanner.close();
    }
}
