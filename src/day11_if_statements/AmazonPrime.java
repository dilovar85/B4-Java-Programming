package day11_if_statements;
/*
Task:
    declare and assign a price variable
    declare and assign a boolean - hasPrime variable

    possible outputs:

        prime member:
            Eligible for 2 day shipping

        not prime and item price is more than or equal 25:
            Eligible for regular free shipping

        not prime and item price is less than 25:
            Not eligible for free shipping. Shipping fee: 3.99



            if prime
                do this
            else
                if
                    do
                else
                    do

 */

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 30.99;
        boolean hasPrimeMembership = false;


        if (hasPrimeMembership) {
            System.out.println("Eligible for 2 days shipping");
        } else {
            if  (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee: $3.99");
            }
        }


        if (hasPrimeMembership) {
            System.out.println("Eligible for 2 days shipping");
        } else if (!hasPrimeMembership && price >= 25) {
            System.out.println("Eligible for regular free shipping");
        } else if (!hasPrimeMembership && price < 25 ) {
            System.out.println("Not eligible for free shipping. Shipping fee: $3.99");
        }
        double price1 = 20.99;
        boolean hasPrimeMembership1 = false;


        if (hasPrimeMembership1) {
            System.out.println("Eligible for 2 days shipping");
        } else {
            if  (price1 >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee: $3.99");
                price1 += 3.99;
            }
        }
        System.out.println("Price: " + price1);



        // Another option to do it.
        if (hasPrimeMembership1) {
            System.out.println("Eligible for 2 days shipping");
        } else if (!hasPrimeMembership1 && price1 >= 25) {
            System.out.println("Eligible for regular free shipping");
        } else if (!hasPrimeMembership1 && price1 < 25 ) {
            System.out.println("Not eligible for free shipping. Shipping fee: $3.99");
        }

    }
}
