package Arrays;

public class binarySearch {
    // function to search 
    public static int BinrySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;

            // comparision
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){ //right side search
                start = mid+1;
            }
            else{ //left side search
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 4;

        System.out.println("Index for "+key+" is: "+ BinrySearch(arr, key));
    }

}
