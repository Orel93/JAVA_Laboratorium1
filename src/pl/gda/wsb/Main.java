package pl.gda.wsb;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human ("Artur", "Arturowski", "Enginer", 23);
        Human human2 = new Human ("Mario", "Kornacki", "Programmer", 25);
        Human human3 = new Human ("Anotnio", "Moretto", "Robotic", 42);

        if (human1.age < human2.age)
        {
            System.out.println(human2.firstName+" is older "+human2.age);
        }
        else if (human2.age > human2.age)
        {
            System.out.println(human1.firstName+" is older "+human2.age);
        }
        else
        {
            System.out.println("they have the same age");
        }
        //System.out.println(human1);
        //System.out.println(human1.firstName);

        //Animal animal1 = new Animal ("monkey", 5, 24.50);
        //Animal animal2 = new Animal ("dog",10,21.12);
        //Animal animal1 =new Animal ("mouse", 10, 1, "mouse");
       //Animal animal2 =new Animal ("lion", 15, 100, "lion");


        /*if (animal1.animalWeight < animal2.animalWeight)
        {
            System.out.println(animal2.animalName+" is heavier "+animal2.animalWeight);
        }
        else if (animal1.animalWeight > animal2.animalWeight)
        {
            System.out.println(animal1.animalName+" is heavier "+animal1.animalWeight);
        }
        else
        {
            System.out.println(animal1.animalName+"and"+animal2.animalName+" weigh the same");
        }

        //System.out.println(animal2);
        //System.out.println(animal2.animalAge);

        Animal animalWithMaxWeight = animal1.animalWeight > animal2.animalWeight ? animal1 : animal2;
        System.out.println("The heaviest animal is" +animalWithMaxWeight.animalName + ". Its weight is:" + animalWithMaxWeight.animalWeight + " kg.");
        StringBuilder animaldesc = new StringBuilder("The heaviest animal is ").
                append(animalWithMaxWeight.animalName).
                append(". Its weight is:");
        System.out.println(animaldesc);

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(human1);

        for (Human human : humanList){
            System.out.println(human1.firstName);
            System.out.println(human2.firstName);
            System.out.println(human3.firstName);

        }*/


        //Phone phone1 = new Phone ("Nokia", 123321521, "blue");
        //Phone phone2 = new Phone ("Xiaomi", 523232123, "red");



        //System.out.println(phone2);
        //System.out.println(phone2.phoneName);

        System.out.println(human1);
        System.out.println(human1.firstName);

        /*animal2.feed();
        animal2.takeForAWalk();

        animal1.feed();
        animal1.feed();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.takeForAWalk();
        animal1.feed();*/

        Car car1 = new Car("Audi", "A4B8", "GCH21345", "Czarny Mat");
        Car car2 = new Car("Porshe", "911", "GD5431A", "Złoty");

        human1.car = car1;
        System.out.println(human1.firstName + " " + human1.lastName + " posiada auto: " + human1.car.marka + human1.car.model + " o numerze rejestracyjnym " + human1.car.nrRejestracyjny + " o kolorze " + human1.car.kolor );
    }
}
