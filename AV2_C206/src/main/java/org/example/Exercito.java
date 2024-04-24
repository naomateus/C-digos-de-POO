package org.example;

public class Exercito {
    private String nome;
    private Soldado[] soldado = new Soldado[3];

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Soldado[] getSoldado() {
        return soldado;
    }

    public void setSoldado(Soldado[] soldado) {
        this.soldado = soldado;
    }

    public String getNome() {
        return nome;
    }

    void addSoldado(Soldado s) {
        for (int i = 0; i < soldado.length; i++){
            if (soldado[i] == null) {
                soldado[i] = s;
                break;
            }
        }
    }

        void mostraInfo() {
            for (int i = 0; i < soldado.length; i++){
                if (soldado[i] != null){
                    soldado[i].mostraInfo();
                }
            }
    }

}