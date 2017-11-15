package me.nallaka.OOPDemo;

public class CarDemo{
    public static void main(String[] args){
//create default car named BatMobile
// set year to 1955
//set make to Lincoln
//set model to Futura
//set color to Black
//print out BatMobile
        Car BatMobile = new Car();
        BatMobile.setYear(1955);
        BatMobile.setMake("Lincoln");
        BatMobile.setModel("Futura");
        BatMobile.setColor("Black");
        System.out.println(BatMobile);
//create a car named BackToTheFuture, Make: DeLorean, Model: DMC-12, Year: 1981, Color:Grey
//set year to 2015
//set year to 1985
//print out BackToTheFuture
        Car BackToTheFuture = new Car("DeLorean", "DMC-12", "Grey", 1981);
        BackToTheFuture.setYear(2015);
        BackToTheFuture.setYear(1985);
        System.out.println(BackToTheFuture);
//create a car named BumbleBee, Make: Chevy Model: Camaro
//set year to 1977
//set color to yellow
//set year to 2009
//print out BumbleBee
        Car BumbleBee = new Car();
        BumbleBee.setYear(1977);
        BumbleBee.setColor("Yellow");
        BumbleBee.setYear(2009);
        System.out.println(BumbleBee);
//Tell me which is older: BatMobile or BumbleBee(use if statements and compareTo)
//Tell me which is older: BatMobile or BackToTheFuture
//Tell me which is older: BackToTheFuture or BumbleBee
        if (BatMobile.compareTo(BumbleBee) > 0) {
            System.out.println("BumbleBee is older");
        } else if (BatMobile.compareTo(BumbleBee) < 0) {
            System.out.println("BatMobile is older");
        } else if (BatMobile.compareTo(BumbleBee) == 0) {
            System.out.println("They are the same age");
        }

        if (BatMobile.compareTo(BackToTheFuture) > 0) {
            System.out.println("BackToTheFuture is older");
        } else if (BatMobile.compareTo(BackToTheFuture) < 0) {
            System.out.println("BatMobile is older");
        } else if (BatMobile.compareTo(BackToTheFuture) == 0) {
            System.out.println("They are the same age");
        }

        if (BackToTheFuture.compareTo(BumbleBee) > 0) {
            System.out.println("BackToTheFuture is older");
        } else if (BackToTheFuture.compareTo(BumbleBee) < 0) {
            System.out.println("BatMobile is older");
        } else if (BackToTheFuture.compareTo(BumbleBee) == 0) {
            System.out.println("They are the same age");
        }

    }
}
