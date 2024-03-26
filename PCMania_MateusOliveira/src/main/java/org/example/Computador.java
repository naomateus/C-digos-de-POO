package org.example;
public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwareBasico = new HardwareBasico[3];
    MemoriaUSB memoria;
    int i;

    public Computador(String marca, float preco, String nomeS, int tipoS, String nomeH1, float capacidadeH1,String nomeH2, float capacidadeH2,String nomeH3, float capacidadeH3) {
        this.marca = marca;
        this.preco = preco;
        this.memoria = memoria;
        this.sistemaOperacional = new SistemaOperacional(nomeS,tipoS);
        this.hardwareBasico[0] = new HardwareBasico(nomeH1, capacidadeH1);
        this.hardwareBasico[1] = new HardwareBasico(nomeH2, capacidadeH2);
        this.hardwareBasico[2] = new HardwareBasico(nomeH3, capacidadeH3);
    }

    void mostraPCConfigs() {
        System.out.println("Marca do PC: "+marca);
        System.out.println("Sistema operacional: "+sistemaOperacional.nome+" "+sistemaOperacional.tipo+" bits");
        System.out.println("Memoria USB: "+memoria.nome+" "+memoria.capacidade);
        for (i = 0; i < hardwareBasico.length; i++)
            if (hardwareBasico[i] != null)
        System.out.println("Hardware: "+hardwareBasico[i].nome+" "+hardwareBasico[i].capacidade);
    }

    void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;
    }
}