package me.nallaka.DataTypeDemo;

/**
 * @author: Mithul Nallaka
 * @dateCreatesd: 8/28/2017
 * @duesDate:
 * Purpose:
 * Methods:
 */
public class PrintDemo {
    /**
     * @Name:
     * Purpose:
     * Input:
     * Return:
     */
    public static void main(String[] args) {
        System.out.print(" ");
        System.out.print("Line 1");
        System.out.print("Line 2");
        System.out.print("\nLine 3\nLine 4");
        System.out.print("\n\tLine 5\tLine 6");
        System.out.println("");//Prints a new line after the string.
        System.out.println("Use \\\\ to represent a \\");// \ is the escape sequence for a \
        System.out.println("Use \\\" to represent a \"");// \" is the escape sequence for a "
        System.out.println("Use \\\' to represent a \'");// \' is the escape sequence for a '

        //the order of printing
        //the order of what oyu print matters to the operations
        System.out.println(3);
        System.out.println(3+4);//+ denotes addition operator between two integers
        System.out.println(3+4+"7");// Does addition operator first then concatenation of addition result and string "7"
        System.out.println("6"+3+4);//All operators concatenate the numbers to the string "634" "6"+3 --> "63"+4 --> "634"
        System.out.println("3"+4);//+ denotes concatenation of the string "3" and the integer 4
    }//end Main
}//end PrintDemo