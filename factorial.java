public class factorial {
    
    static int factorial(int n) {
        if (n!= 0)  
            return n * factorial(n-1); 
        else
            return 1;
    }

    public static void main(String[] args) {
        int n = 6, result;
        result = factorial(n);
        System.out.printf("Factorial of %d is : %d", n, result);
    }
}