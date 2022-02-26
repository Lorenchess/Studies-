package PolimorExample;

public class Main {
    public static void main(String[] args) {
      Animal animal = new Animal("Animal");
      Dog dog = new Dog("Duke");
      Cat cat = new Cat("Puzzi");

      Animal dog2 = new Dog("Ken");
      Animal dog3 = new Animal("Ken");

        animal.talk();
        dog.talk();
        cat.talk();
        System.out.println("...........");

        dog2.talk();
        dog3.talk();

      System.out.println("------------------");

      dog.play();
      ///dog2.play() it does not let me call it because is type Animal
    }
}
