package br.com.treinaweb.semana2;

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
        for (var contador2 = 1; contador2 <= 1000; contador2++) {
            System.out.println("Número " + contador2);
        }
    }
}
