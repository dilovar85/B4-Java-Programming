package day39_a_polimorphism.book;
// Child Abstract Class
public abstract class EBook extends Book implements Downloadable {
    int storageSize;
    public abstract void open();
}