package S9_Interfaces_AbstractClasses_InnerClasses.AbstractClasses;

import S9_Interfaces_AbstractClasses_InnerClasses.Challenge18_Interfaces.Player;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Jonny");
        dog.breathe();
        dog.eat();

        Bird bird = new Parrot("Picky");
        bird.breathe();
        bird.eat();

        Parrot parrot = new Parrot("Whilie");
        parrot.breathe();
        parrot.eat();
    }
}
