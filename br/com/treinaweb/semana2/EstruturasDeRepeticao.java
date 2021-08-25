package br.com.treinaweb.semana2;

import java.util.ArrayList;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while e do-while
        var contador = 1001;
        while (contador <= 1000) {
            System.out.println("Número " + contador);
            contador++;
        }

        do {
            System.out.println("Número " + contador);
            contador++;
        } while (contador <= 1000);

        // for
        var notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(8.5);
        notas.add(9.1);
        notas.add(7.2);

        for (var index = 0; index < notas.size(); index++) {
            System.out.println(notas.get(index));
        }

        // foreach
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
