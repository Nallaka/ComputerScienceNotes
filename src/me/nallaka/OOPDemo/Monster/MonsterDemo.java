package me.nallaka.OOPDemo.Monster;

public class MonsterDemo {
    public static void main(String[] args) {
        Monster a = new Monster();
        a.setHeight(40);
        a.setAge(25);
        a.setWeight(100);
        System.out.println(a);

        Monster b = new Monster(2000, 150);
        b.setAge(200);

        Monster c = new Monster(55);
        c.setAge(50);

        a.getAgeDiff(c);

    }
}
