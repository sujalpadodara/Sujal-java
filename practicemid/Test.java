class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Test {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.sound();
        Animal b = new Cat();   // parent reference, child object
        b.sound();

        Animal c = new Dog();
        c.sound();
    }
}