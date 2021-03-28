package pl.gda.wsb;

import java.sql.SQLOutput;

public class Animal {

    final String species;
    String animalName;
    int animalAge;
    double animalWeight;
    private double weight;

    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 100.0;
    public static final Double DEFAULT_WEIGHT = 50.0;



    public Animal(String animalName, int animalAge, double animalWeight, String species) {
        this.animalName = animalName;
        //this.animalAge = animalAge;
        //this.weight = animalWeight;
        this.species = species;
        if (species.equals("mouse")){
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if (species.equals("lion")){
            this.weight = DEFAULT_LION_WEIGHT;
        } else this.weight = DEFAULT_WEIGHT;
    }

    void feed() {
        if (weight <= 0){
            System.out.println(this.species + " ---> za późno ;/");
        } else{
            weight++;
            System.out.println(this.species + "--> dzięki ;D, moja waga to " + this.weight);
        }
    }
    void takeForAWalk(){
        weight--;
        if (weight <=0){
            System.out.println(this.species + "--> NIE!!, Nie możesz wyjść na spacer z martwym zwierzęciem -.-");
            } else if (weight <= 3){
            System.out.println(this.species + "--> JESTEM GłODNY!!");
        } else {
            System.out.println(this.species + " --> Dzięki za spacer, moja waga jest ok, czyli" + this.weight);
        }
    }
}
