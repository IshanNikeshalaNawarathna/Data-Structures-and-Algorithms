public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {2,5,9,3,0,7,8};
        
        selectionSort(arr);
        
        for (int num : arr) {   
            System.out.print(num + " ");
        }

    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length -1; i++){

            int min = i;

            for (int a = i+1; a < arr.length; a++){
                if (arr[a] < arr[min]){
                    min = a;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }

}
