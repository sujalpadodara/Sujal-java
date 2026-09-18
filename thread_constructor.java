

class A extends Thread{
    public A(String name){
        super(name);
    }
    public void run(){
        
        System.out.println("Thank you");

    }
}
public class thread_constructor {
    public static void main(String[] args) {
    A t1 = new A("Sujal");
    A t2 = new A("Ram");
    t1.start();
    t2.start();
    System.out.println("The id of the thread t1 is " + t1.getId());
    System.out.println("The name of the thread t1 is " + t1.getName());
    System.out.println("The id of the thread t2 is " + t2.getId());
    System.out.println("The name of the thread t2 is " + t2.getName());

    }
}
