package day37_a_abstarction.car;

public class Garage {
    public static void main(String[] args) {

        // We canNOT create object of abstract class
        //Car car = new Car();
        //car.start();

        Toyota toyota = new Toyota();
        toyota.start();


        Honda honda = new Honda();
        honda.start();

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.charge();




    }
}