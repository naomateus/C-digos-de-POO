package org.example;

public class Cliente {
    String nome = "Mat";
    long cpf = 151548951;
    Computador[] computador = new Computador[10];
    float soma;
    float calculaTotalCompra(){
        for (int i = 0; i < computador.length; i++)
        {
            if (computador[i] != null)
                soma += computador[i].preco;
        }
        return soma;
    }
}
