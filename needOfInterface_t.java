interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("I am coding...");
    }

}

class Desktop implements Computer {
    public void code() {
        System.out.println("I am desktop...");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class needOfInterface_t {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer sujal = new Developer();

        sujal.devApp(lap);

    }
}
