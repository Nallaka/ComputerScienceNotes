package me.nallaka.OOPDemo.FoxDemo;

public class Fox {
    //name
    private String name;

    public Fox() {
        this.name = "Foxie";
    }

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fox\n The fox's name is '" + name + "\n";
    }

    public String whatDoesTheFoxSay() {
        return "ring ding ding";
    }

    //2 constructors
    //to string
    //whatdoesthefoxsay
}
