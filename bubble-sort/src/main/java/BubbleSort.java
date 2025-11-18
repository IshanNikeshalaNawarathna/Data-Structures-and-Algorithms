public class BubbleSort {

    public static void main(String[] args) {
        
        int[] arr = {5,2,0,8,7,3,4};
        
        bubbleSort(arr);
        
        for (int number : arr){
            System.out.print(number + " ");
        }
        
    }

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) { // Number of passes
            for (int j = 0; j < arr.length - i - 1; j++) { // Adjacent comparisons
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; //swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
