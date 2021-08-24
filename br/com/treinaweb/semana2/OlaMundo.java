package br.com.treinaweb.semana2;

public class OlaMundo {
    public static void main(String[] args) {
        String nome = "TreinaWeb";
        int idade = 20;
        float altura = 1.7f;
        double altura2 = 1.7;
        boolean estaVivo = true;

        var variavel = "TreinaWeb com var";

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(altura2);
        System.out.println(estaVivo);
        System.out.println(variavel);

        final var CONSTANTE = "TreinaWeb";

        System.out.println(CONSTANTE);
    }
}