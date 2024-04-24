package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ItemEspecial item1 = new ItemEspecial();
        item1.tipo = "Pistola";
        MedicoMilitar medico = new MedicoMilitar("João",63421425,item1,50,900);
        ItemEspecial item2 = new ItemEspecial();
        item2.tipo = "Fuzil";
        Oficial oficial = new Oficial("Bruna",1234567899,item2,"Cabo");
        ItemEspecial item3 = new ItemEspecial();
        item3.tipo = "Espingarda";
        Sargento sargento = new Sargento("Elisa",764321345, item3,"Marinha",400);

        Exercito exercito = new Exercito();
        exercito.setNome("Elite");

        exercito.addSoldado(medico);
        exercito.addSoldado(oficial);
        exercito.addSoldado(sargento);

        sargento.defender();
        oficial.defender();
        medico.curar();

        sargento.usandoItem();
        medico.usandoItem();
        oficial.usandoItem();

        exercito.mostraInfo();

        System.out.println("----QUANTIDADE----");
        System.out.println("Quantidade de soldados: "+Soldado.qtdSoldado);
    }
}