package org.example;

public class Oficial extends Soldado implements Defesa{
    private String patente;

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public Oficial(String nome, long cpf, ItemEspecial item, String patente) {
        super(nome, cpf, item);
        this.patente = patente;
    }

    @Override
    void mostraInfo(){
        super.mostraInfo();
        System.out.println("Patente do oficial: "+patente);
    }
    @Override
    void usandoItem(){
        super.usandoItem();
    }

    @Override
    public void defender() {
        System.out.println("----DEFESA INICIANDO----");
        if (item != null)
            System.out.println(getNome()+" conseguiu se defender");
        else
            System.out.println(getNome()+" não conseguiu se defender");
    }
}
