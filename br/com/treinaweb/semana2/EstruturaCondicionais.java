package br.com.treinaweb.semana2;

public class EstruturaCondicionais {
    public static void main(String[] args) {
        // if/else
        var idade = 15;
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else if (idade >= 16) {
            System.out.println("Você é menor de idade, mas já pode votar");
        } else {
            System.out.println("Você é menor de idade");
        }

        var mesDoAno = 2;
        switch (mesDoAno) {
            case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            default -> System.out.println("Mês invalido");
        }
    }
}
