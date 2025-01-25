package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        System.out.println(animal1.species);
        System.out.println(new Animal().population);

        animal1.species = "Bird";
        animal1.population = 1000000;

        System.out.println(animal1.species);
        System.out.println(animal1.population);

        System.out.println(animal1);

        System.out.println(animal1.toString());

        Animal animal2 = new Animal();
        System.out.println(animal2);
    }
}
