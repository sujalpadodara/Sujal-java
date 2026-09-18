

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        boolean f = true;
        
        
        Scanner sc = new Scanner(System.in);
        while(f){
            System.out.println("Enter the index");
        int ind = sc.nextInt();
       
            try{
            System.out.println("Welcome");
            try{
                System.out.println(marks[ind]);
                f=false;
            }
            catch(Exception e){
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1 ");
        }
    }
    }
}