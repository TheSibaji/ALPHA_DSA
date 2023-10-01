package Sorting_Algo;

public class counting_sort {
    public static void countingSort(int arr[]){

        // finding the range of the array for geting the   count array size
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        // createing the count array & and storing the frequency
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length-1; i++){
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        countingSort(arr);
        printSort(arr);
    }
}
