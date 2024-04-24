package org.example;

public class Mago extends Habitante implements Feitico {
    private String cor;

    public Mago(int id, String nome, int idade, float energia, String cor,Arma arma) {
        super(id, nome, idade, energia, arma);
        this.cor = cor;
    }

    void atacar (){
        super.atacar();


    }
    @Override
    void mostraInfo(){
        System.out.println("Informações do Mago: ");
        super.mostraInfo();
        System.out.println("Cor: "+cor);
    }

    @Override
    public void lancaFeitico() {
        System.out.println("O mago lançou um feitiço!");
        energia = energia*0.9f;
    }
}
