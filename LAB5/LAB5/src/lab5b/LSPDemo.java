package lab5b;

class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}

public class LSPDemo {
    public static void main(String[] args) {
        Bird bird = new Ostrich(); 
        try {
            bird.fly(); 
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
