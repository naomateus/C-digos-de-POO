package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Jose", "543655", 45);
        Funcionario f2 = new Funcionario("Mat", "543655", 45);
        Arquivo a = new Arquivo();

        a.escrever(f1);
        a.escrever(f2);

        ArrayList<Funcionario> funcionarios = a.ler();

        for (int i = 0; i < funcionarios.size(); i++){
            System.out.println("Nome: "+funcionarios.get(i).getNomeFunc());
            System.out.println("CPF: "+funcionarios.get(i).getCpfFunc());
            System.out.println("Idade: "+funcionarios.get(i).getIdadeFunc());
        }

    }
}