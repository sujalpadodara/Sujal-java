class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Good morning");
        }
    }
}
class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Welcome");
           
        }
    }
}
public class thread_practice {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        t1.setPriority(6);   //seted ptiority
        t2.setPriority(9);

//  if u do not set the priority then the default priority is 5

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());         // this gives a state of thread as new 


        t1.start();
        t2.start();
         System.out.println(t2.getState());          //this gives another state of thread ie.runnable
    
         System.out.println(Thread.currentThread().getState());    // by using this we can see the current state of thread
        }
}
