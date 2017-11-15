package me.nallaka.OOPDemo.StudentDemo;

public class methoddemo {
    public static void main(String[] args) {
        print(3,4);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static double divide(int a, int b){
        return a/b;
    }

    public static void print(int a, int b){
        System.out.println(add(a,b));
        System.out.println(divide(a,b));
    }
}
