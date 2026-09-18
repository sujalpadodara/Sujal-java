class Monkey {
    public void jump() {
        System.out.println("Jumping...");
    }

    public void bite() {
        System.out.println("Biting...");
    }
    
}

interface BasicAnimal {
    void eat();

    void sleep();

}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Speaking 2");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class problem3 {
    public static void main(String[] args) {
        Human sujal = new Human();
        sujal.eat();
        Monkey sujal2 = new Human();
        sujal2.jump();
    }
}
