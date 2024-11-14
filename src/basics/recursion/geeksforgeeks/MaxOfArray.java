package basics.recursion.geeksforgeeks;

public class MaxOfArray {

    public static int maxOfArray(int[] arr, int n) {
        if(n == 0) {
            return arr[0];
        }
        return Math.max(arr[n], maxOfArray(arr, n-1));
    }

    public static void main(String[] args) {
        int[] arr = {41,25,33,44,93,68,71,82,29};
        int n = arr.length;
        int max = maxOfArray(arr, n-1);
        System.out.println(max);
    }
}
