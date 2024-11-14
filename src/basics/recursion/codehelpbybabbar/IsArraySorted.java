package basics.recursion.codehelpbybabbar;

public class IsArraySorted {
    public static boolean isSorted(int[] arr, int n){
        //base case
        if(n == 1 || n == 0) {
            return true;
        }

        //Optional Part
        if(arr[n]<arr[n-1]) {
            return false;
        }

        //recursive part
        return isSorted(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,6,7,8,9,16};
        int n = arr.length;
        boolean p = isSorted(arr, n-1);
        if(p) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
