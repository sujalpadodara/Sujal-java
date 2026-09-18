class phone {
    public void time() {
        System.out.println("8o clock");
    }

    public void on() {
        System.out.println("phone is on");
    }
}

class smartphone extends phone {
    public void music() {
        System.out.println("I am music");
    }

    public void on() {
        System.out.println("smartphone is on");
    }
}

public class methoddispatch{
    public static void main(String[] args) {
        phone a = new smartphone();
        smartphone b = new smartphone();
        phone c = new phone();
        a.on();
        b.music();
        a.time();
    }
}
