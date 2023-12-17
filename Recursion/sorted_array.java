package Recursion;

public class sorted_array {

    // check if a array is sorted or not
    public static boolean isSorted(int arr[], int i){

        if(i == arr.length-1){
            return true;
        }
        
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6};
        int arr2[] = {21, 6, 8, 4, 90};

        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arr2, 0));
    }
}
