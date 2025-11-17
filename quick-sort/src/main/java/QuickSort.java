public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 40, 5, 9, 7, 4, 500};

        quickSort(arr, 0, arr.length - 1);

        for (int array : arr) {
            System.out.print(array + " ");
        }


    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end <= start) return;
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1); //left side
        quickSort(arr, pivot + 1, end); // right side

    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;

    }


}
