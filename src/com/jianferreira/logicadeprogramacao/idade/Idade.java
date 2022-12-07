package com.jianferreira.logicadeprogramacao.idade;

public class Idade {
    public static int calcularDias(int idade){
        /*
            1-------365
            20------dias

            dias = 365 * 20;
        */
        int dias = idade * 365;
        return dias;
    }
}
