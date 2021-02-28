package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human ("Artur", "Arturowski", "Enginer", 23);
        Human human2 = new Human ("Mario", "Kornacki", "Programmer", 25);

        if (human1.age < human2.age)
        {
            System.out.println("human 2 is older ");
        }
        else if (human2.age > human2.age)
        {
            System.out.println("human 1 is older ");
        }
        else
        {
            System.out.println("they have the same age");
        }
        System.out.println(human1);
        System.out.println(human1.firstName);

        Animal animal1 = new Animal ("monkey", 5, 24.50);
        Animal animal2 = new Animal ("dog",10,21.12);

        if (animal1.animalWeight < animal2.animalWeight)
        {
            System.out.println("animal2 is heavier ");
        }
        else if (animal1.animalWeight > animal2.animalWeight)
        {
            System.out.println("animal1 is heavier");
        }
        else
        {
            System.out.println("they weigh the same");
        }

        System.out.println(animal2);
        System.out.println(animal2.animalAge);

        Phone phone1 = new Phone ("Nokia", 123321521, "blue");
        Phone phone2 = new Phone ("Xiaomi", 523232123, "red");


        System.out.println(phone2);
        System.out.println(phone2.phoneName);

    }
}
