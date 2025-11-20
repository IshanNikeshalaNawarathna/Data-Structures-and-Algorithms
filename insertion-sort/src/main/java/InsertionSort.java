public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 8, 1, 5, 9};

        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            System.out.println("key " + key);
            int j = i - 1;
            System.out.println("j " + j);
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // shift right
                j--;
                System.out.println("j " + j--);
            }
            arr[j + 1] = key; // insert key
        }

    }

}
