package org.example;

public class Locadora{
    String nome = "Mat locadora";
    String CNPJ = "54354";
    String endereco = "SRS";
    float carrosParaAlugar;
    float contadorcarros = 0;
    Carro[] car;
    public Locadora(){car = new Carro[10];}

    void adicionarCarro (Carro carro){
        for (int i = 0; i < this.car.length; i++){
            if (car[i] == null){
                car[i] = carro;
                break;
            }
        }
    }
    void mostraInfo(){
        System.out.println("A locadora "+nome+", do CNPJ: "+CNPJ+" está no endereço: "+endereco);
        for (int i = 0; i < car.length; i++)
        {
            if (car[i] != null){
                car[i].mostraInfo();
                System.out.println();
            }
        }
    }

    float contarCarrosParaAlugar(){
        carrosParaAlugar = 0;
        for (Carro carros : car) {
            if (carros != null) {
                if (!carros.alugado)
                    carrosParaAlugar++;
                contadorcarros++;
            }
        }

        float saldocarros = (carrosParaAlugar/contadorcarros)*100;
        return saldocarros;
    }

    void alugarCarro(int index) {
        if (car[index] != null)
            if (!car[index].alugado){
                car[index].alugado = true;
                System.out.println("Carro alugado!");
    }
        else
                System.out.println("Carro indisponível!");
    }

}
