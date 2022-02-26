package PolimorExample;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The dog eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps outside to protect the house");
    }

    @Override
    public void talk() {
        System.out.println("Bark...bark...");
    }

    public void play() {
        System.out.println("The dog play with a ball");
    }
}
