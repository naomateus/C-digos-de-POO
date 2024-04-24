package org.example;

import java.sql.SQLOutput;

public abstract class Soldado {
    static int qtdSoldado;
    private String nome;
    private long cpf;
    ItemEspecial item;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Soldado(String nome, long cpf, ItemEspecial item) {
        qtdSoldado++;
        this.nome = nome;
        this.cpf = cpf;
        this.item = item;
    }

    void mostraInfo(){
        System.out.println("---- DADOS DO SOLDADO ----");
        System.out.println("Nome do soldado: "+nome);
        System.out.println("CPF do soldado: "+cpf);
        System.out.println("Tipo de item do soldado: "+item.tipo);
    }

    void usandoItem(){
        System.out.println("---- USANDO ITEM----");
        if(item != null)
        System.out.println(nome+" utilizando item especial");
        else
            System.out.println(nome+" não tem item especial para utilizar");
    }
}
