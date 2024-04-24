package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario tecnico = new Tecnico("Bruna", 23, 2000, "Elétrica");
        Funcionario gerente = new Gerente("Fernanda",18,5000, "Ágil");
        Empresa empresa = new Empresa();

        empresa.addFuncionario(tecnico);
        empresa.addFuncionario(gerente);

        empresa.mostraInfo();
    }
}