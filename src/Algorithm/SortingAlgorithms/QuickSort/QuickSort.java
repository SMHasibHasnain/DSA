package Algorithm.SortingAlgorithms.QuickSort;

public class QuickSort {

    public static int partition(int[] arr, int left, int high) {
        int pivot = arr[high];
        int i = left-1;
        for(int j=left; j<high; j++) {
            if(arr[j]<pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left<right) {
           int pi = partition(arr, left, right);
            quickSort(arr, left, pi-1);
            quickSort(arr, pi+1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2 ,4, 6, 7};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
