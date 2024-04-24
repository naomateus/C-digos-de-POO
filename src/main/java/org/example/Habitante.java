package org.example;

public abstract class Habitante {
    static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    Arma arma;

    public Habitante(Arma arma) {
        this.arma = arma;
    }

    public Habitante(int id, String nome, int idade, float energia, Arma arma) {
        contador++;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        this.arma = arma;
        this.id = id;
    }

    void atacar(){
        System.out.println("O herói atacou!");
        if (arma.isMagica() == false)
            energia = energia-20;
        else
            energia=energia-10;
        System.out.println("Energia atual: "+energia);
    }

    void mostraInfo(){
        System.out.println("Id do herói:"+id);
        System.out.println("Nome do herói: "+nome);
        System.out.println("Idade do herói: "+idade);
        System.out.println("Energia do herói: "+energia);
        System.out.println("Arma do herói: "+arma.getNomeArma());
        System.out.println();
    }
}
