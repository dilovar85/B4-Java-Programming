package day07_ralational_operators;

public class AgeGroup {
    public static void main(String[] args) {

/*
Task:

    declare and assign an age variable
        - is the person a kid ( up to 13, include 13)
        - is the person a senior citizen ( 65 and above)

 */


                int ageOfPerson = 65;
                boolean isKid = ageOfPerson <= 13;
                boolean isSenior = ageOfPerson >= 65;

                System.out.println("The person is Kid: " + isKid);
                System.out.println("The person is Senior: " + isSenior);
    }
}
