package me.nallaka.DataTypeDemo;
/**
 * @author: Mithul Nallaka
 * @dateCreatesd: 08/23/2017
 * @duesDate:
 * Purpose: Explain the primitive data types
 * Methods: Main
 */
public class DataTypeLabOne {
    /**
     * @Name: Main
     * Purpose:
     * Input: None
     * Return: Primitive Data Types
     */
    public static void main(String[] args) {
        int sydneyAge = 17;
        int mithulAge = 15;
        int jonAge = 16;
        int kathrineAge = 17;
        int chrisAge = 17;
        int total = sydneyAge + mithulAge + jonAge + kathrineAge + chrisAge;

        System.out.println("The total age of collected ages is: " + total);

        double ageAverage1 = total/5;
        double ageAverage2 = total/5.0;

        System.out.println("Average 1: " + ageAverage1 + "\nAverage 2: " + ageAverage2);

        boolean camBool = false;
        boolean swinnyBool = true;
        boolean landonBool = true;

        System.out.println("Cams favorite food is key lime pie with ketchup... " + camBool
                            + "\nSwinny finds favor with the dark knight... " + swinnyBool
                            + "\nLandon has betrayed the Brentwood family... " + landonBool
                            );

        char charOne = 'A';
        char charTwo = 65;
        char charThree = 65+15;
        int change = 16;
        char charFour = (char) ('A' + change);

        System.out.println(charOne + " " + charTwo + " " + charThree + " " + charFour);

    }//end of main
}//end of DataTypeLabOne
