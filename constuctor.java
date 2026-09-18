class MyMainEmployee {
   private int id;
   private String name;
   private int salary;

   public MyMainEmployee() {
      id = 56;
      name = "SujalPatel";
   }

    public MyMainEmployee(String MyName,int MyId) {
      id = MyId;
      name = MyName;
   }

   public MyMainEmployee(int s){
      salary = s;
   }

   public String getName() {
      return name;
   }

   public void setName(String n) {
      name = n;
   }

   public int getId() {
      return id;
   }

   public void setId(int i) {
      id = i;
   }
   
   public int getSalary() {
    return salary;
}

   public void setSalary(int s) {
    this.salary = s;
}

   
}

public class constuctor {
   public static void main(String[] args) {
      // MyMainEmployee sujal = new MyMainEmployee("CodeWithSUjal",67);
      MyMainEmployee sujal = new MyMainEmployee();
         // MyMainEmployee sujal = new MyMainEmployee(9000);

      // method overloading is possible in constuctor


     
      System.out.println(sujal.getName());
      System.out.println(sujal.getId());
      // System.out.println(sujal.getSalary());

   }
}