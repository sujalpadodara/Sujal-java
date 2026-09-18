class MyEmployee{
     private int id;
     private String name;

     public String getName(){
        return name;
     }
     public void setName(String n){
        name = n;
     }
     public int getId(){
        return id;

     }
     public void setId(int i){
        id = i;
     }
}
public class modifiers {
    public static void main(String[] args){
        MyEmployee sujal=new MyEmployee();
        
    //     System.out.println(sujal.name);
    //     System.out.println(sujal.id);
         sujal.setName("CodeWithSujal");
            sujal.setId(33);
            System.out.println(sujal.getName());
            System.out.println(sujal.getId());
    }
}
