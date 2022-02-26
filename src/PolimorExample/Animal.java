package PolimorExample;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("The animal eats...");
    }

    public void sleep() {
        System.out.println("The animal sleeps...");
    }

    public void talk() {
        System.out.println("The animal makes sound...");
    }
}
