package Sorting_Algo;

public class bubble {
    // bubble sort
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // print the sorted arr
    public static void printBubbleSort(int arr[]){
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int num[] = {12, 0, 3, 8, 90, 12};

        bubbleSort(num);
        printBubbleSort(num);
    }
}