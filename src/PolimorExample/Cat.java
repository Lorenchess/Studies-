package PolimorExample;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The cat eats mouse");
    }

    @Override
    public void sleep() {
        System.out.println("The cat sleeps in bedroom");
    }

    @Override
    public void talk() {
        System.out.println("miau...miau...");
    }
}
