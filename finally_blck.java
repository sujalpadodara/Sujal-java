public class finally_blck {
    public static int sujal() {
        try {
            for (int i = 0; i < 10; i++) {
                
                if (i == 7) {
                    break;
                    
                }
                System.out.println(i);
                return i;
                
            
            }
        } catch (Exception e) {
            System.out.println(e);
        } 
        // finally {
            System.out.println("Clean the program");
        // }
        return -1;

    }

    public finally_blck() {
    }

    public static void main(String[] args) {
        sujal();

    }
}
