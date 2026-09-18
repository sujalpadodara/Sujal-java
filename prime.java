public class prime{
    public static void main(String[] args) {
        int n=2;
        int count=0;
        while (count<5) {
            boolean Isprime = true;
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    Isprime = false;
                    break;
                }
                
            }
            if(Isprime){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}


