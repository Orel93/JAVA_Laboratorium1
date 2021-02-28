package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Human human1 = new Human ("Artur", "Arturowski", "Enginer");
        Human human2 = new Human ("Mario", "Kornacki", "Programmer");

        System.out.println(human1);
        System.out.println(human1.firstName);

        Animal animal1 = new Animal ("monkey",10);
        Animal animal2 = new Animal ("dog",10);

        System.out.println(animal2);
        System.out.println(animal2.animalAge);

        Phone phone1 = new Phone ("Nokia", 123321521, "blue");
        Phone phone2 = new Phone ("Xiaomi", 523232123, "red");

        System.out.println(phone2);
        System.out.println(phone2.phoneName);

    }
}
