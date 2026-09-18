public class methodsoverloading {
    static void xyz(int a) {
        a = 90;

    }

    static void xyz2(int arr[]) {
        arr[0] = 99;
    }

    static void abc() {
        System.out.println("Good morning");
    }

    static void abc(int a) {
        System.out.println(a);
    }

    static void abc(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        // int x=45;
        // xyz(x);
        // System.out.printf("%d",x);

        // int [] arr={1,2,3,4,5};
        // xyz2(arr);
        // System.out.println(arr[0]);
        abc();

        abc(89);

        abc(78, 4);
    }
}
