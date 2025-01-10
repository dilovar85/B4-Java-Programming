package day38_b_polymorphism.animal;



public class Forest {
    public static void main(String[] args) {


        // 1 - Animal
        // Reference itself
        Animal animal = new Animal();
        //animal.eat();
        animal.name = "General Animal";
        //System.out.println(animal.name);


        // 2 - Lizard
        // 2.a - Reference is itself
        Lizard lizard1 = new Lizard();
        // What lizard1 has access
        lizard1.skinColor = "Blue";
        lizard1.eat();
        lizard1.numOfLegs = 10;
        lizard1.name = "Lizard";
        System.out.println(lizard1.skinColor);
        System.out.println(lizard1.numOfLegs);
        System.out.println(lizard1.name);


        System.out.println();
        // 2.b - Reference is parent
        Reptile lizard2 = new Lizard();
        // What lizard2 has access
        // lizard2.skinColor = "Blue"; // Since reference decides what is accessible, skinColor not being in Reference class gives an error
        lizard2.eat(); // If Reptile class and its Parent Animal do not have eac() method, there Reptile class does not have access to eact();
        lizard2.numOfLegs = 10;
        lizard2.name = "Lizard";
        // System.out.println(lizard2.skinColor); // // Since reference decides what is accessible, skinColor not being in Reference class gives an error
        System.out.println(lizard2.numOfLegs);
        System.out.println(lizard2.name);

    }
}