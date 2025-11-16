public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {2,7,80,900,5,4,21,13};

        int index = linearSearch(arr,900);

        if(index!=-1){
            System.out.println("Element found at index "+index);
        }else{
            System.out.println("Element not found");
        }

    }

    private static int linearSearch(int[] arr, int value) {

        for (int i = 0; i <arr.length; i++){
            if(arr[i]==value){
                return i;
            }
        }

        return -1;
    }

}
