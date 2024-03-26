package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        //Formatando as promoções
        Computador promocao1 = new Computador("Positivo",3300,"Linux Ubuntu",32,"Pentium Core i3", 2200,"Memória RAM",8,"HD",500);
        Computador promocao2 = new Computador("Acer",8800,"Windows 8",64,"Pentium Core i5", 3370,"Memória RAM",16,"HD",1);
        Computador promocao3 = new Computador("Vaio",4800,"Windows 10",32,"Pentium Core i7", 4500,"Memória RAM",32,"HD",2);

        //Adicionando os USBs
        MemoriaUSB memoriausb1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB memoriausb2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB memoriausb3 = new MemoriaUSB("HD Externo", 1);

        //Agregando as memórias
        promocao1.addMemoriaUSB(memoriausb1);
        promocao2.addMemoriaUSB(memoriausb2);
        promocao3.addMemoriaUSB(memoriausb3);

        //Criando contadores
        int c1=0;
        int c2=0;
        int c3=0;

        //Criando uma entrada
        Scanner cin = new Scanner(System.in);
        int promocao;

        //Sistema
        System.out.println("Bem-vind@ ao PC Mania!");
        System.out.println("Estamos tendo promoções! São elas:");
        System.out.println();
        System.out.println("Promoção 1:");
        promocao1.mostraPCConfigs();
        System.out.println();
        System.out.println("Promoção 2:");
        promocao2.mostraPCConfigs();
        System.out.println();
        System.out.println("Promoção 3:");
        promocao3.mostraPCConfigs();
        System.out.println();
        System.out.println("O menu de compras funciona da seguinte maneira:");
        System.out.println("Selecione 1 para comprar a promoção 1");
        System.out.println("Selecione 2 para comprar a promoção 2");
        System.out.println("Selecione 3 para comprar a promoção 3");
        System.out.println("Selecione 0 para finalizar a compra!");
        System.out.println();

        boolean flag = true;
        while (flag) {

            promocao = cin.nextInt();
            switch (promocao) {
                case 1:
                    for (int i = 0; i < cliente.computador.length; i++){
                        if (cliente.computador[i] == null) {
                            cliente.computador[i] = promocao1;
                            c1++;
                            break; //Adiciona e sai novo metodo
                        }
                    }break;
                case 2:
                    for (int i = 0; i < cliente.computador.length; i++){
                        if (cliente.computador[i] == null) {
                            cliente.computador[i] = promocao2;
                            c2++;
                            break; //Adiciona e sai novo metodo
                        }
                    }break;
                    case 3:
                        for (int i = 0; i < cliente.computador.length; i++){
                            if (cliente.computador[i] == null) {
                                cliente.computador[i] = promocao3;
                                c3++;
                                break; //Adiciona e sai novo metodo
                            }
                        }break;
                case 0:
                    System.out.println("Compra finalizada!");
                    flag = false;
                    break;
            }
        }
        System.out.println("Nome do cliente: "+cliente.nome+". CPF: "+cliente.cpf);
        if (c1 > 0){
            System.out.println(cliente.nome+" comprou "+c1+" PCs da promoção 1");
        }
        if (c2 > 0){
            System.out.println(cliente.nome+" comprou "+c2+" PCs da promoção 2");
        }
        if (c3 > 0){
            System.out.println(cliente.nome+" comprou "+c3+" PCs da promoção 3");
        }
        System.out.println("O total da compra é de: "+cliente.calculaTotalCompra()+" reais");

        cin.close();
    }
}
