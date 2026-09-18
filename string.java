import java.util.Scanner;
public class string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s ="SUJAL";
        System.out.println(s);

        // // ----------------------------
        // String p = sc.nextLine();
        // System.out.println(p);
        // System.out.printf("The value of s is %s and p is %s",s,p);

        // ----------------------------------

        int value= s.length();
        System.out.println(value);

        String lString= s.toLowerCase();
        System.out.println(lString);

        String uString= s.toUpperCase();
        System.out.println(uString);

        String nontrim = "   Patel   ";
        System.out.println(nontrim);

        String trimed = nontrim.trim();
        System.out.println(trimed);


        // ----------------------------

        System.out.println(s.substring(2));

        System.out.println(s.replace('A', 'U'));

        System.out.println(s.replace("AL", "LO"));

        // --------------------------------------------

        System.out.println(s.startsWith("SUJ"));
        System.out.println(s.startsWith("PAT"));

        System.out.println(s.endsWith("AL"));
        System.out.println(s.endsWith("ALO"));


        System.out.println(s.charAt(2));

        System.out.println(s.indexOf("UJ"));


        System.out.println(s.equals("SUJAL"));
        System.out.println(s.equalsIgnoreCase("SuJaL"));
    }
}
