package nf1.fullstack.repaspoo.solidL.ex1;

// FlyingBird.java
public interface FlyingBird extends IBird {
    void fly();
}

// Bird.java
interface IBird {
    void eat();
}

// Sparrow.java
class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow eating...");
    }
    @Override
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

// Penguin.java
class Penguin2 implements IBird {
    @Override
    public void eat() {
        System.out.println("Penguin eating...");
    }
}

// Main.java
class Main4 {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly(); // OK

        IBird penguin = new Penguin2();
        penguin.eat(); // OK
    }
}
