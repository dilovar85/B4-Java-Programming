package day35_inheritance.recap;

/*
    create a class called Pizza

    - data:

        size (String), number of toppings

    - constructor

        - create a constructor that creates a Pizza object with the size and the number of toppings

            call setters here

    - encapsulate the Pizza class

        - setter condition:
            size can only be:
                small, medium, or large

            number of toppings must be a positive number

    - other methods methods:

        - calculatePrice()
                calculate the price of the pizza based on:

                    small base: $4
                    medium base: $6
                    large base: $8

                    each topping adds $0.75 to the price

                    calculate the total price and return the cost

        - toString()
            print the size, number of toppings, and cost of the pizza
 */

public class Pizza {
    private String size;
    private int numOfToppings;

    public Pizza (String size, int numOfToppings){
       // this.size = size;
        setSize(size);

        //this.numOfToppings = numOfToppings;
        setNumOfToppings(numOfToppings);

    }
    public void setSize (String size){
        if(size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("medium")  ||
                size.equalsIgnoreCase("large")){

            this.size = size;
        }
    }

    public void setNumOfToppings (int numOfToppings){
        if(numOfToppings > 0) {
            this.numOfToppings = numOfToppings;
        }
    }

    public double calculatePrice() {
        double totalPrice = 0;

        if(size.equalsIgnoreCase("small")){
            totalPrice = 4;
        }else if (size.equalsIgnoreCase("medium")){
            totalPrice = 6;
        }else if(size.equalsIgnoreCase("large")){
            totalPrice = 8;
        }

        totalPrice += numOfToppings * 0.75;

        return totalPrice;
    }

    // Special method for printing the object info
        public String toString() {
        return "Pizza Info: " +
                "\n\tSize: " + size+
                "\n\tNumber of Toppings: " + numOfToppings +
                "\n\t Total Price: $" + calculatePrice() ;
    }


}
