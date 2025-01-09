package day37_a_abstarction.language;



public class Spanish implements Language {

    @Override
    public void sayHello() {
        System.out.println("Hola");
    }

    @Override
    public void sayGoodbye() {
        System.out.println( "Adios");
    }


}