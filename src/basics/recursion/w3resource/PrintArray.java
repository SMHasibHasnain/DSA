package basics.recursion.w3resource;

public class PrintArray {

    public static void printFunc(int[] arr, int n) {
        if(n == 0) {
            return;
        }
        printFunc(arr, n-1);
        System.out.println(arr[n-1]);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 4, 1, 5, 3};
        printFunc(arr, n);
    }
}
