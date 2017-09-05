package me.nallaka.DataTypeDemo;

public class IntToDouble {
    public static void main(String[] args){
        //Initialize Vars
        double doubleOne = 1.0;
        double doubleTwo = 2.0;
        int doubleAddition;

        // = doubleOne + doubleTwo; //This will always return as error as int is not compatible with double, but double is compatible with int
        doubleAddition = ((int) doubleOne) + ((int) doubleTwo);//You have to cast the double to an int if possible to achieve adding two doubles to an int
    }
}
