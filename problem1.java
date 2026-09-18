import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sub 1 marks:");
        int a = sc.nextInt();

        System.out.println("Enter sub 2 marks:");
        int b = sc.nextInt();
        System.out.println("Enter sub 3 marks:");
        int c = sc.nextInt();
        int d = a + b + c;
        System.out.print("total marks:");
        System.out.println(d);
        int avg = d / 3;
        System.out.print("The percentage is:");
        System.out.println(avg);

        // -----------------------------------------

        // System.out.print("Enter a:");
        // int a = sc.nextInt();
        // System.out.println(a>=88);
    }

}
