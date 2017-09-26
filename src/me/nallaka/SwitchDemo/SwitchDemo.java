package me.nallaka.SwitchDemo;

import java.util.Scanner;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/25/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class SwitchDemo {
    /**
     * @Name: Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        //Basic Syntax
        //switch(variableBeingEvaluated) {
        // case:
        //default:
        //}

        int value = 64;
        //write a switchstatement that determines if value if even or odd.
        switch(value % 2) {
            case 0:
                System.out.println("Value is even");
                break;
            case 1:
                System.out.println("Value is odd");
                break;
            default:
                System.out.println("Value is neither");
                break;
        }

        Scanner in = new Scanner(System.in);
        System.out.println("What is your order?\n#1 Chicken Sandwich w/ fries\n#2 Spicy Chicken Sandwich\n#3 Chicken Salad");
        if (in.hasNextInt()) {
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Chicken Sandwich with fries");
                    break;
                case 2:
                    System.out.println("Spicy Chicken Sandwich");
                    break;
                case 3:
                    System.out.println("Chicken Salad");
                    break;
                default:
                    System.out.println("You didn't pick anything on the menu");
                    break;
            }
        } else {
            System.out.println("Wrong choice...");
        }

        String color = "red";
        String color2 = "blue";
        switch (color) {
            case "blue":
                System.out.println("blue");
                break;
            case "red":
                System.out.println("red");
                break;
            case "RED":
                System.out.println("RED");
                break;
            default:
                System.out.println("other");;
                break;
        }
    }//end Main
}//end SwitchDemo