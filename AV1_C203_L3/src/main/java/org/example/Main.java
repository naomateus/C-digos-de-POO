package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Carro[] carro = new Carro[10];
    Locadora locadora = new Locadora();
    boolean sistema = true;
    Scanner op = new Scanner(System.in);

    //Adicionando carros
        while(sistema){
            System.out.println("----------");
            System.out.println("Bem-vindo à Locadora");
            System.out.println("1 - Adicionar carro");
            System.out.println("2 - Mostrar informações da locadora e seus carros");
            System.out.println("3 - Carros disponíveis para alugar");
            System.out.println("4 - Alugar um carro");
            System.out.println("5 - Encerrar");

            int cin;
            cin = op.nextInt();
            switch(cin){
                case 1:
                    Carro carro1 = new Carro();
                    op.nextLine();
                    System.out.println("Adicione o modelo do carro:");
                    carro1.modelo = op.nextLine();
                    System.out.println("Insira a cor do carro:");
                    carro1.cor = op.nextLine();
                    System.out.println("Insira a velocidade máxima do carro:");
                    carro1.motor.velocidadeMaxima = op.nextFloat();

                    locadora.adicionarCarro(carro1);
                    break;
                case 2:
                    locadora.mostraInfo();
                    break;
                case 3:
                    float resposta = locadora.contarCarrosParaAlugar();
                    System.out.println("Porcentagem de carros disponíveis: "+resposta+"%");
                        break;
                case 4:
                    System.out.println("Selecione o carro que queira alugar:");
                    for (int i = 0; i < locadora.car.length; i++) {
                        if (locadora.car[i] != null) {
                            if (!locadora.car[i].alugado) {
                                System.out.println("Index: "+i);
                                locadora.car[i].mostraInfo();

                            }
                        }
                    }
                    System.out.println("Entre com o index do carro que quer alugar");
                    int carroindex = op.nextInt();
                    locadora.alugarCarro(carroindex);
                    break;
                case 5:
                    System.out.println("Obrigado!");
                    sistema = false;
                    break;
            }
        }
        op.close();
    }
}