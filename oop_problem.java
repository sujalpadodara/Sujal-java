// prob 1
// class Employee {

//     int salary;
//     String name;

//     public int getSalary() {
//         return salary;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String n) {
//         name = n;
//     }
// }

// public class oop_problem {
//     public static void main(String[] args) {
//         Employee sujal = new Employee();
//         sujal.setName("CodeWithSujal");
//         sujal.salary = 999;
//         System.out.println(sujal.getSalary());
//         System.out.println(sujal.getName());
//     }
// }

// ------------------------------------------------prob 2
// class CellPhone {
//     public void Ringing() {
//         System.out.println("Ringing...");
//     }

//     public void Vibrating() {
//         System.out.println("Vibrating...");
//     }
// }

// public class oop_problem {
//     public static void main(String[] args) {
//         CellPhone victus = new CellPhone();
//         victus.Vibrating();
//         victus.Ringing();
//     }
// }

// ----------------------------------------prob 3
// class square{
//     int side;

//     public int area(){
//         return side*side;
//     }

//     public int peimeter(){
//         return 4*side;
//     }

// }
// public class oop_problem{
//     public static void main(String[] args) {
//         square sq = new square();
//         sq.side=5;
//         System.out.println(sq.area());
//         System.out.println(sq.peimeter());
//     }
// }

// --------------------------------------prob 4

class rectangle {
    int l;
    int b;

    public int area() {
         return l*b;
    }
    public int peimeter(){
        return 2*(l+b);
    }
}

public class oop_problem {

    public static void main(String[] args) {
        rectangle rc = new rectangle();
        rc.l=8;
        rc.b=4;
        System.out.println(rc.area());
        System.out.println(rc.peimeter());
        }
}

// -----------------------------------prob 5

// class freefire{
// public void hitting(){
//     System.out.println("Hitting the Enemy");
// }
// public void firing(){
//     System.out.println("Enemy is firing");
// }
// public void running(){
//     System.out.println("Enemy is running");
// }
// }
// public class oop_problem{
//     public static void main(String[] args) {
//         freefire ff= new freefire();
//         ff.hitting();
//         ff.firing();
//         ff.running();

//     }
// }