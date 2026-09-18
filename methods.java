public class methods {
    static int linearSearch(int marks[], int n, int target) {

        for (int i = 0; i < n; i++) {
            if (marks[i] == target) {
                System.out.printf("Target found at index %d", i);

                return i;
            }

        }
        System.out.println("Target not found");
        return 0;
    }

    public static void main(String[] args) {
        int[] marks = { 12, 52, 66, 88, 44 };
        int target = 88;
        int n = marks.length;

        linearSearch(marks, n, target);

    }
}

// public class methods {
// static int bubblesort(int arr[],int n){
// for (int i = 0; i < arr.length-1; i++) {
// for (int j = 0; j < arr.length-i-1; j++) {
// if(arr[j]>arr[j+1]){
// int temp = arr[j];
// arr[j]=arr[j+1];

// arr[j+1]=temp;
// }
// }
// }
// return 0;

// }
// public static void main(String[] args) {
// int [] arr ={5,6,9,7,2};
// int n = arr.length;
// bubblesort(arr,n);

// for (int i = 0; i < arr.length; i++) {

// System.out.println(arr[i]);
// }
// }
// }