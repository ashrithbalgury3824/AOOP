package lab5b;

interface Worker {
    void work();
}

interface Eater {
    void eat();
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}

class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }
}

public class ISPDemo {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Human human = new Human();

        robot.work();
        human.work();
        human.eat();
    }
}
