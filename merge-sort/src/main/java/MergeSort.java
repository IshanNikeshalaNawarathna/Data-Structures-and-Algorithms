public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {2,8,5,7,9,0,4};

        mergeSort(arr, 0, arr.length - 1); //left = 0 , right = 6

        // print statement
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    private static void mergeSort(int[] arr, int left, int right) {

        if(left >= right) return; // 0 < 6

        int mid = (left + right) / 2; // getting to the mid-value = 3

        //divide
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        //merge value
        merge(arr, left, mid, right); // merge both value

    }

    private static int merge(int[] arr, int left , int mid, int right) {

        //find the two size in both array
        int n1  = mid - left + 1;
        int  n2 = right - mid;

        //create two temp array set the sizes
        int[] temp_Left = new int[n1];
        int[] temp_Right = new int[n2];

        //copy element into left side
        for (int i = 0; i < n1; i++) {
            temp_Left[i] = arr[left + i]; // ex : temp_Left[0] = arr[0];
        }
        for (int i = 0; i < n2; i++) {
            temp_Right[i] = arr[mid + 1 + i]; // ex : temp_Right[0] = arr[4];
        }

        // position left array, position right array and position original array
        int i = 0, j = 0;
        int k = left;

        //compare and merge
        while (i < n1 && j < n2) {
            if (temp_Left[i] <= temp_Right[j]) {
                arr[k++] = temp_Left[i++];
            }else{
               arr[k++] = temp_Right[j++];
            }
        }

        //Copy remaining elements
        while (i < n1) arr[k++] = temp_Left[i++];
        while (j < n2) arr[k++] = temp_Right[j++];

        return k;

    }

}
