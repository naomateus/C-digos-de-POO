package org.example;

public class Tecnico extends Funcionario implements Interface {
    private String especialidade;
    private int horaExtra;

    public Tecnico(String nome, int idade, float salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Informações do funcionário:");
        System.out.println("Nome do técnico: "+super.getNome());
        System.out.println("Idade do técnico: "+super.getIdade());
        System.out.println("Salário: "+getHoraExtra()*31.5f);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public float recebeHoraExtra(int horas) {
        setHoraExtra(10);
        return 0;
    }
}