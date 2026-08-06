public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i =0; i<=arr.length-1; i++)  {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // recursive function 
    public static void quicksort (int arr[], int si, int ei) {
        if (si >= ei ) {
            return;
        }
        // Last element --> pivot
        int pivotIndx = partition(arr, si, ei);
        quicksort(arr, si, pivotIndx-1);  // left part
        quicksort(arr, pivotIndx+1, ei);  // right part
    }

    // partiton function 
    public static int partition (int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // to male palce for element smaller than pivot 
        
        for (int j=si; j<ei; j++){
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
    return i;
    }
    public static void main(String[] args) {
        int arr [] = {6, 3, 9, 8, 2, 5, -7};
        quicksort(arr, 0, arr.length-1);
        printArr(arr);

    }
    
}
