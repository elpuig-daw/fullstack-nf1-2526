package nf1.fullstack.repaspoo.solidL.ex1;

// Bird.java
public class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}


class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

// Main
class Main3 {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.fly(); // Throws exception, violates LSP
    }
}
