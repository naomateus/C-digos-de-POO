package org.example;

public class MedicoMilitar extends Soldado implements Curar{
    private int anosExperiencia;
    private int capacidadeEmergencia;

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setCapacidadeEmergencia(int capacidadeEmergencia) {
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public int getCapacidadeEmergencia() {
        return capacidadeEmergencia;
    }

    public MedicoMilitar(String nome, long cpf, ItemEspecial item, int anosExperiencia, int capacidadeEmergencia) {
        super(nome, cpf, item);
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    @Override
    void mostraInfo() {
        super.mostraInfo();
        System.out.println("Anos de experiência: "+anosExperiencia);
    }

    @Override
    void usandoItem() {
        if (item != null)
            capacidadeEmergencia = capacidadeEmergencia+100;
        super.usandoItem();
    }

    @Override
    public void curar() {
        System.out.println("----CURA INICIANDO----");
        if (capacidadeEmergencia > 920)
            System.out.println("O médico militar conseguiu curar seu aliado!");
        else
            System.out.println("O médico militar não conseguiu curar seu aliado...");
    }
}
