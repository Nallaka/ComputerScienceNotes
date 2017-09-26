package me.nallaka.LoopDemo;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/26/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class ForLoopDemo {
    /**
     * @Name: main
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        /*
        * For loops are built from 4 parts
        * for(part19start); part2(stop); part3(inc/dec)) {
        * }
        *i++, i-- Inc, Dec by 1
        * i+= 4; i = i+4;
        * i -= 4; i= i-4;
        * i *= 4;, i /= 4, i %= 4;
        */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        int product = 1;

        for (int i = 1; i < 20; i += 2) {
            product *= i;
        }
        System.out.println(product);

        String a = "abcdefghijklmnopqrstuvwxyz";

        for (int i = a.length()-1; i >=0; i-=2) {
            System.out.print(a.charAt(i));
        }
    }//end Main
}//end ForLoopDemo