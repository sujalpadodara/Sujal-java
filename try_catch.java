public class try_catch {
    public static void main(String[] args) {
        int a= 9000,b=0;
        try {
            int c=a/b;
            System.out.println(c);
            
        } catch (Exception e) {
            System.out.println("We are failed to execute. Reason:");
            System.out.println(e);
        }
        System.out.println("End");
    }
}
