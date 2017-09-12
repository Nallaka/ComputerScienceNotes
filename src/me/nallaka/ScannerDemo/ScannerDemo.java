package me.nallaka.ScannerDemo;

import java.util.Scanner;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/12/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class ScannerDemo {
    /**
     * @Name:
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        //Step1 import scanner class
        //Step2 create scanner object
        Scanner scanner = new Scanner(System.in);

        //Step 3 prompt the user for input
        System.out.println("Hello! What is your name?");;
        //Step 4 Use mthod to retrieve input
        String name = scanner.nextLine();
        System.out.println("You name is: " + name);

        System.out.println("Where do you work?");
        String work = scanner.next();//Default delimiter is space
        System.out.println("You work at: " + work);

        System.out.println("How old are you");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println("You are " + age + " years old!");
        }

        System.out.println("How many pizzas can Cam eat at one time?");
        double pizza = scanner.nextDouble();
        System.out.println("Cam can eat " + pizza + " pizzas?!");

        System.out.println("Enter true or false");
        boolean tf = scanner.nextBoolean(); //Not case sensitive
        System.out.println(tf);

    }//end Main
}//end ScannerDemo