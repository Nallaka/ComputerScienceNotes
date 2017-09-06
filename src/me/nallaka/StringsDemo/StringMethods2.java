package me.nallaka.StringsDemo;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/6/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class StringMethods2 {
    /**
     * @Name: upperPiece
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static String upperPiece(String string, int beginningIndex, int endingIndex) {
        String result = "";
        result += string.substring(0,beginningIndex);
        result += string.substring(beginningIndex,endingIndex).toUpperCase();
        result += string.substring(endingIndex);
        return result;
    }

    /**
     * @Name: main
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        //charAt(i) returns the char found at index i
        System.out.println(a.charAt(0)); //return a
        System.out.println(a.charAt(9));

        //Calling a method
        //object.method(parameters[])

        //this.compareTo(s) return one of three types of values
        //Negative this comes before s alphabetically
        //0 means they are equal
        //Pos means this comes after s alphabetically
        System.out.println("apples".compareTo("oranges"));
        //a --> 97  o--> 111 97-111 = -14
        //Looks at each corredponding char of both strings
        //returns the first non-zero value
        System.out.println("apples".compareTo("applet"));
        //when it gets to zero, move to the next char
        //return -1 s-t
        System.out.println("apples".compareTo("apple"));
        //the shorter word comes first
        //Uppercase takes priority due to higher ASCII value

        //compareToIgnoreCase(); Treats same letter the same regardless of case
        System.out.println("apples".compareToIgnoreCase("APPLES"));

        //contains(x); Returns true or false if string contains argument x
        System.out.println("apples".contains("b")); //returns false
        System.out.println("apples".contains("a")); //returns true
        //checks for the literal string
        System.out.println("apples".contains("al")); //returns false

        //indexOf() returns the first index where the string x appears
        System.out.println("apples".indexOf("a")); //returns 0
        System.out.println("apples".indexOf("p")); //returns 1 Will not return 2nd p
        System.out.println("apples".indexOf("p", 2)); //return 2
        System.out.println("apples".indexOf("d")); //returns -1 because d is not found
        System.out.println("apples".indexOf("ple")); //returns 2

        //lastIndexOf(x) returns last index where string x appears
        System.out.println("apples".lastIndexOf("p")); //returns 2

        //length() returns the number of chars in a string
        System.out.println("apples".length()); //returns 6
        System.out.println("apples and oranges".length()); //returns 18
        //last index is 23, but length is 24

        //replace(x, y) replace all instances of x with y
        System.out.println("apples".replace('a','b'));
        System.out.println("apples".replace("a","b"));
        System.out.println("apples".replace("a","obo"));

        //substring(x) returns a new string copied from the index x to the end of the string
        System.out.println("apples".substring(4)); //returns string from index 4 to end of string
        //substring(x, y) returns new string copied from x until y-1
        System.out.println("apples".substring(0,5)); //returns string from index 0 to 5

        //toLowerCase()/toUpperCase() both make temp strings from original
        System.out.println("apples".toUpperCase());
        System.out.println("APPLES".toLowerCase());

        String str = "Go bruins!";
        System.out.println(upperPiece(str, 0 , 9));
    }//end Main
}//end StringMethods2