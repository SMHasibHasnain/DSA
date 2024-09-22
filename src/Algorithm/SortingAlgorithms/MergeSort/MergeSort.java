package Algorithm.SortingAlgorithms.MergeSort;

class MergeSort {

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
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
            right[j] = arr[mid+j+1];
        }
        int i = 0, j = 0, k = l;
        while(i<n1 && j<n2) {
            if(left[i]<right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<n1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<n2) {
            arr[k] = right[j];
            k++;
            j++;
        }

    }

    static void mergeSort(int[] arr, int l, int r) {
        if(l>=r) {
            return;
        }
        mergeSort(arr, l, (l+r)/2);
        mergeSort(arr, (l+r)/2 +1, r);
        merge(arr, l, (l+r)/2, r);
    }

    public static void main(String[] args){
        int[] arr = {2, 4, 3, 1, 5};
        int n = arr.length;

        System.out.println("Unsorted Array: ");
        display(arr);

        int l = 0;
        int r = n-1;

        mergeSort(arr, l, r);

        System.out.println("\nSorted Array: ");
        display(arr);
    }
}