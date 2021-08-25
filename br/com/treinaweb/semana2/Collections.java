package br.com.treinaweb.semana2;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        // List
        var notas = new ArrayList<Double>();
        notas.add(10.0);
        notas.add(8.7);
        notas.add(7.1);

        System.out.println(notas.size());

        // Map
        var medias = new HashMap<String, Double>();
        medias.put("Hanashiro", 10.0);
        medias.put("Fagner", 8.7);
        medias.put("Elton", 5.1);

        System.out.println(medias.get("elton"));
    }
}
