package day36_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {

        FinalExample obj1 = new FinalExample(10);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        System.out.println(FinalExample.PLANET);


        System.out.println("------------");
        FinalExample obj2 = new FinalExample(20);
        System.out.println(obj1.PLANET);
        System.out.println(obj2.PLANET);


    }
}
