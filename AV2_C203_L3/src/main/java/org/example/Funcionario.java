package org.example;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private float salario;
    static int qtdFuncionarios;

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getSalario() {
        return salario;
    }


    public Funcionario(String nome, int idade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        qtdFuncionarios++;
    }

    public void mostraInfo(){
        System.out.println("Nome do funcionário: "+nome);
        System.out.println("Idade do funcionário: "+idade);
        System.out.println("Salário: "+salario);
    }
}
