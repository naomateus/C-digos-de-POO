package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arma a1 = new Arma();
        a1.setNomeArma("Revólver");
        Anao anao = new Anao(1,"B",20,100,1.69f,"Animal",a1);
        Arma a2 = new Arma();
        a2.setNomeArma("Cotoco");
        Elfo elfo = new Elfo(2,"C",20,100,"Madeira",a2);
        Arma a3 = new Arma();
        a3.setNomeArma("Varinha");
        Mago mago = new Mago(2,"C",20,100,"Verde",a3);
        TerraMedia terramedia = new TerraMedia();

        terramedia.addHabitante(anao);
        terramedia.addHabitante(elfo);
        terramedia.addHabitante(mago);

        anao.atacar();
        elfo.atacar();
        mago.atacar();
        anao.minerar();
        elfo.lancaFeitico();
        elfo.curar();
        mago.lancaFeitico();

        terramedia.listarHabitantes();

        System.out.println(Habitante.contador);
    }
}