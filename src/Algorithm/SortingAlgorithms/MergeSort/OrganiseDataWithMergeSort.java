package Algorithm.SortingAlgorithms.MergeSort;
import java.util.Scanner;

public class OrganiseDataWithMergeSort {

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[i+l];
        }
        for(int j = 0; j<n2; j++){
            right[j] = arr[mid+j+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if(l >= r) return;

        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int[] arr = new int[p];
        for(int i=0; i<p; i++) {
            arr[i] = input.nextInt();
        }
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
