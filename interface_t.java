interface A {
    int age = 20;

    String city = "Delhi";

    // initialization is must bcz it is final and static

    void run();

    void swim();

    void palying();
}

class B implements A {
    public void run() {
        System.out.println("running");
    }

    public void swim() {
        System.out.println("swimming");
    }

    public void palying() {
        System.out.println("playing");
    }
}

public class interface_t {
    public static void main(String[] args) {
        A sujal = new B();
        sujal.swim();
        sujal.palying();
        sujal.run();
        // A.city="Rajkot";
        // u cannot change the name as they are final by default in interface

        System.out.println(A.age);
        System.out.println(A.city);
    }
}
