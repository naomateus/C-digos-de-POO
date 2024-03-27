package org.example;

public class Rapper {
    String nome;
    float nota;
    int idade;
    Microfone microfone;
    Rapper[] rapper = new Rapper[5];
    Arena arena;

    void mostraInfo() {
        arena.mostraInfo();
        for (int i = 0; i < rapper.length; i++) {
            if (rapper[i] != null) {
                System.out.println("Nome do rapper: " + nome);
                System.out.println("Nota do rapper: " + nota);
                System.out.println("Idade do rapper: " + idade);
                System.out.println("Microfone do rapper é: " + microfone.material);
            }
        }
    }
}