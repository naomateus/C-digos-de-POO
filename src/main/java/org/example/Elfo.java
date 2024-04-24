package org.example;

import java.sql.SQLOutput;

public class Elfo extends Habitante implements Cura, Feitico{
    private String tribo;

    public Elfo(int id, String nome, int idade, float energia, String tribo, Arma arma) {
        super(id, nome, idade, energia, arma);
        this.tribo = tribo;
    }

    void viajar(){
        System.out.println("O elfo está viajando");
    }

    void atacar(){
        super.atacar();
    }

    @Override
    void mostraInfo(){
        System.out.println("Informações do Elfo: ");
        super.mostraInfo();
        System.out.println("Tribo do elfo: "+tribo);
    }

    @Override
    public void curar() {
        System.out.println("O elfo se curou!");
        energia = energia*1.15f;
    }

    @Override
    public void lancaFeitico() {
        System.out.println("O elfo lançou um feitiço!");
        energia = energia*0.9f;
    }
}
