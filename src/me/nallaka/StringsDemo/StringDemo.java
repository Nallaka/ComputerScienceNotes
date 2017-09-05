package me.nallaka.StringsDemo;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/5/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods: Main
 */
public class StringDemo {
    //Reference Data Type
    //Is different that a primitive datatype(int, double, bool, char)
    //Primitive datatypes hold the literal values they are given
    //int w=9; then w hold the value of an int 9
    //Strings are references
    //References hold the memory reference for stored information
    //String w = "apples"; then w hold memory ref for the string :apples" in memory
    //A ref is simply an address for a given block of memory

    /**
     * @Name: main
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b); //evaluate true

        String one = "bruins"; //String one def new space in memory = "bruins filling space
        String two = "bruins"; // String two def new space
        //one and two are occupying different space; one and two have diff references
        //one == two, do the two variables have the same value
        //one = memory location (#1000) --> ["bruins"]
        //two = memory location (#1001) --> ["bruins"]
        //one == two is #1000 == #1001 Answer: False
        //one == two? Answer: Null
        System.out.println(one == two);
        System.out.println(one.equals(two));

/*        String answer = "bananas";
        String guess = userInput;
        answer.equals(guess);
        guess.equals(answer);
        answer.equalsIgnoreCase(guess);*/

        String three = "pizza";
        String four = three;
        System.out.println(four);
        three = "yogurt";
        System.out.println(three);

    }//end Main
}//end StringDemo