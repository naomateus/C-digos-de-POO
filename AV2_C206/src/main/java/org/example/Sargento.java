package org.example;

public class Sargento extends Soldado implements Defesa{
    private String especializacao;
    private int experienciaCombate;

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void setExperienciaCombate(int experienciaCombate) {
        this.experienciaCombate = experienciaCombate;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public int getExperienciaCombate() {
        return experienciaCombate;
    }

    public Sargento(String nome, long cpf, ItemEspecial item, String especializacao, int experienciaCombate) {
        super(nome, cpf, item);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    @Override
    void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especialização do sargento: "+especializacao);
    }

    @Override
    void usandoItem() {
        if (item != null)
            experienciaCombate = experienciaCombate+300;
        super.usandoItem();
    }

    @Override
    public void defender() {
        System.out.println("----DEFESA INICIANDO----");
        if (experienciaCombate > 650)
            System.out.println("O sargento conseguiu se defender!");
        else
            System.out.println("O sargento não conseguiu se defender...");
    }
}
