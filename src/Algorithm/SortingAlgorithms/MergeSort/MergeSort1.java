package Algorithm.SortingAlgorithms.MergeSort;

public class MergeSort1 {

    static void display(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0; i<n1; i++) {
            left[i] = arr[i+l];
        }
        for(int j=0; j<n2; j++) {
            right[j] = arr[j+mid+1];
        }
        int i=0, j=0, k=l;
        while (i<n1 && j<n2) {
            if(left[i]<right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while(i<n1) {
            arr[k++] = left[i++];
        }
        while(j<n2) {
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if(l>=r) {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 7, 1};
        int n = arr.length;
        int l = 0;
        int r = n-1;

        System.out.println("Unsorted: ");
        display(arr);

        mergeSort(arr, l, r);

        System.out.println("Sorted: ");
        display(arr);
    }
}
