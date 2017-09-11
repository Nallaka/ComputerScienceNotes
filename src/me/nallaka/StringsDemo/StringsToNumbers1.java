package me.nallaka.StringsDemo;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/11/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class StringsToNumbers1 {
    /**
     * @Name: Main
     * Purpose: Parsing strings
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        //String to Number
        //Converting Strings to int
        String i = "2345";
        int num1 = Integer.parseInt(i); //num1 = 2345

        //Converting strings to doubles
        String d = "12.34";
        double dub1 = Double.parseDouble(d); // dub1 = 45.903

        //Convert strings to boolean
        String b = "true";
        boolean bool1 = Boolean.parseBoolean(b); //bool1 = flase

        //Converting int to string
        int w = 1;
        String w1 = Integer.toString(w);

        //Convertins double to string
        double d2 = 5.5;
        String dub2 = Double.toString(d2);

        //Converting boolean to string
        boolean b1 = true;
        w1 = Boolean.toString(b1);

    }//end Main
}//end StringsToNumbers1