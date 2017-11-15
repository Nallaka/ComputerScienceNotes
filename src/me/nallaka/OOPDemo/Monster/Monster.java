package me.nallaka.OOPDemo.Monster;

public class Monster {
    private int height, weight, age;
    //Height in inches
    //Weight in lbs
    //Age in years

    //default constructor
    public Monster() {
        this.height = 0;
        this.weight = 0;
        this.age = 0;
    }

    public Monster(int height) {
        this.height = height;
        this.weight = 0;
        this.age = 0;
    }

    public Monster(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.age = 0;
    }

    public Monster(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    //Returns the difference this height and other height and other height
    //returns positive if is taller,negative if lower
    //returns 0 if same;
    public int getHeightDiff(Monster other) {
        return this.getHeight()-other.getHeight();
    }

    public int getAgeDiff(Monster other) {
        return this.getAge()-other.getAge();
    }

    public int getWeightDiff(Monster other) {
        return this.getWeight()-other.getWeight();
    }
}
