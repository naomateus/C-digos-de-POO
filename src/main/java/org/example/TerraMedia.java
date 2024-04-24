package org.example;

public class TerraMedia {
    private Habitante[] herois = new Habitante[10];
    void addHabitante (Habitante habitante){
        for (int i = 0; i < herois.length; i++){
            if (herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    void listarHabitantes(){

        for (int i = 0; i < herois.length; i++){
            if (herois[i] != null){
                herois[i].mostraInfo();
            }
        }
    }
}
