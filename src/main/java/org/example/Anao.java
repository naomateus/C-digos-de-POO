package org.example;

public class Anao extends Habitante implements Mineracao{
    private float altura;
    private String reino;

    public Anao(int id, String nome, int idade, float energia, float altura, String reino, Arma arma) {
        super(id, nome, idade, energia, arma);
        this.altura = altura;
        this.reino = reino;
    }

    void atacar(){
        super.atacar();
    }
    @Override
    void mostraInfo(){
        System.out.println("Informações do anão: ");
        super.mostraInfo();
        System.out.println("Altura do anão: "+altura);
        System.out.println("Reino do anão: "+reino);
    }

    @Override
    public void minerar() {
        System.out.println("O anão está minerando");
    }
}
