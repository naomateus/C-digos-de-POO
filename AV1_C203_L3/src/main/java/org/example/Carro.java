package org.example;

public class Carro {
    String modelo;
    String cor;
    boolean alugado = false;
    Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    void mostraInfo(){
        System.out.println("Modelo do carro: "+modelo);
        System.out.println("Cor do carro: "+cor);
        System.out.println("Alugado? "+alugado);
        motor.mostraInfo();
    }
}
