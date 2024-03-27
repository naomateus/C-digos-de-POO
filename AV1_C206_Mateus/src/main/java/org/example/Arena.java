package org.example;

public class Arena {
    String nome = "Cantina";
    String lugar = "Inatel";
    int microfonedourado = 0;
    int maior = 0;
    int menor = 10;
    Rapper[] rappers;
    public Arena(){
        rappers = new Rapper[5];
    }

    void addRapper(Rapper rapper) {
        for (int i = 0; i < rappers.length; i++) {
            if (rappers[i] == null)
                rappers[i] = rapper;
            break;
        }
    }

    void mostraInfo() {
        System.out.println("A arena "+nome+" está localizada no "+lugar);
        System.out.println("Os rappers que estão na arena hoje são:");
    }

    void microfoneDou() {
        for (int i = 0; i < rappers.length; i++) {
            if (rappers[i].microfone.material.equals("Dourado"))
                microfonedourado++;
        }
    }

    void ranking() {
        for (int i = 0; i < rappers.length; i++) {
            if (rappers[i] != null) {
                if (rappers[i].nota > maior)
                    maior = i;
                if (rappers[i].nota < menor)
                    menor = i;
            }
            System.out.println("O rapper que ganhou a batalha é: "+rappers[maior].nome);
            System.out.println("O rapper que ficou em último lugar é: "+rappers[menor].nome);
            break;
        }
    }
}
