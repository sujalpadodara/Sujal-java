class Employee {
    int id;
    String name;
    int salary;

   public void printDetails() {
        System.out.printf("My id is %d\n", id);
        System.out.printf("My name is %s\n", name);
        System.out.printf("My salary is %d\n", salary);
    }

}

public class class1 {
    public static void main(String[] args) {
        System.out.println("This is my first class");
        Employee sujal = new Employee();
        Employee john = new Employee();

        sujal.id = 90;
        sujal.name = "Coder";
        sujal.salary = 6000;

        john.id = 88;
        john.name = "Programmer";
        john.salary = 5000;

        // System.out.println(sujal.id);
        // System.out.println(sujal.name);

        sujal.printDetails();

        john.printDetails();

    }
}
