package me.nallaka.LoopDemo;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/4/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class WhileLoopDemo {
    /**
     * @Name: main
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        //Example 1 reversing a number digit by digit
        int number = 12345;
        int result = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            result = (result * 10) + digit;
        }

        //digit = 5; start = 1234; result = 0; result = 5;
        //digit = 4; start = 123; result = 50; result = 54;
        //digit = 3; start = 12; result = 540; result = 543
        //digit = 2; start = 1; result = 5430; result = 5432;
        //digit = 1; start = 0; result = 54320; result = 54321;

        System.out.println(result);
    }//end Main
}//end WhileLoopDemo