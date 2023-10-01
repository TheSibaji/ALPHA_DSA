package Sorting_Algo;

public class insertion {

    // insertion sort
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            // find the right position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            // 
            arr[prev+1] = curr;
        }
    }

    // print 
    public static void printSort(int arr[]){
        System.out.println("The sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 2, 9};

        // calling the function
        insertionSort(arr);
        printSort(arr);
    }
}
