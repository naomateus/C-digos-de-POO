package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();
        boolean flag = true;
        int op;
        Scanner cin = new Scanner(System.in);
        Rapper rapper = new Rapper();

        //Sistema
        while (flag){
            System.out.println("----------");
            System.out.println("Bem-vindo à batalha de rap!");
            System.out.println("1 - Adicionar rappers à arena");
            System.out.println("2 - Mostrar informações da arena e seus rappers");
            System.out.println("3 - Rappers com microfone dourado");
            System.out.println("4 - Mostrar qual rapper ganhou a batalha e qual ficou em último lugar");
            System.out.println("5 - Encerrar");
            op = cin.nextInt();
            switch (op){
                case 1:
                    cin.nextLine();
                    Rapper rap = new Rapper();
                    System.out.println("Insira aqui o nome do rapper:");
                    rap.nome = cin.nextLine();
                    System.out.println("Insira aqui a nota do rapper:");
                    rap.nota = cin.nextFloat();
                    System.out.println("Insira aqui a idade do rapper:");
                    rap.idade = cin.nextInt();
                    System.out.println("Insira aqui o material do microfone do rapper:");
                    cin.nextLine();
                    rap.microfone.material = cin.nextLine();

                    arena.addRapper(rap);
                    System.out.println("Rapper adicionado!");
                    break;
                case 2:
                    rapper.mostraInfo();
                    break;
                case 3:
                    System.out.println("O número de rappers com microfone dourado é de:");
                    rapper.arena.microfoneDou();
                    break;
                case 4:
                    rapper.arena.ranking();
                    break;
                case 5:
                    System.out.println("Obrigado!");
                    flag = false;
                    break;
            }
        }
    }
}