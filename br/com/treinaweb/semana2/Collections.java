package br.com.treinaweb.semana2;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        // List
        var notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(8.7);
        notas.add(7.1);

        System.out.println(notas.size());
    }
}
