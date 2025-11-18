public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 10, 11};

        int search = binarySearch(arr, 0, arr.length - 1, 1);

        if(search != -1){
            System.out.println("Found at index " + search);
        }else {
            System.out.println("Not found");
        }


    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) return -1;
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        }else if (arr[mid] > target){
            return binarySearch(arr, start,mid-1,target);
        }else {
            return binarySearch(arr,mid+1,end,target);
        }

    }


}
