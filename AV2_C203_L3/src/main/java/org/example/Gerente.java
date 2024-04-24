package org.example;

public class Gerente extends Funcionario{
    private String setor;

    public Gerente(String nome, int idade, float salario, String setor) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    @Override
    public void mostraInfo(){
        System.out.println("Informações do funcionário:");
        super.mostraInfo();
        System.out.println("Setor: "+setor);
    }
}
