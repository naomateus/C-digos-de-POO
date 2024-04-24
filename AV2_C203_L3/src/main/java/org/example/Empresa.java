package org.example;

public class Empresa {
    private String nome;
    private Funcionario[] funcionario = new Funcionario[3];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    void mostraInfo(){
        System.out.println("Nome da empresa: "+nome);
        for (int i = 0; i < funcionario.length; i++){
            if (funcionario[i] != null){
                funcionario[i].mostraInfo();
            }
        }
    }

    void addFuncionario (Funcionario f){
        for (int i = 0; i < funcionario.length; i++){
            if (funcionario[i] == null){
                funcionario[i] = f;
                break;
            }
        }
    }

}
