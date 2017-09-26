package me.nallaka.IfElseDemo;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/19/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class IfElseDemo {
    /**
     * @Name: Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        if (2 > 1) {
            System.out.println("2>1");
        }

        String bob = "bob";
        String robert = "robert";

        if (bob.equals(robert)) {
            System.out.println("Bob = robert");
            System.out.println("Bob is robert");
        }

        int age = 19;
        if (age >= 18 && age < 21) {
            System.out.println("You can't drink or vote.");
        }

        if (age < 16 || age > 100) {
            System.out.println("you probably shouldn't drive.");
        }

        int choice = 1;
        switch (choice) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }//end Main
}//end IfElseDemo