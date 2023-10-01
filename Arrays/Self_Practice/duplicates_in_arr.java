package Arrays.Self_Practice;

import java.util.Arrays;

public class duplicates_in_arr {

    public static void findDuplicate(int arr[]){
        // sort the array
        Arrays.sort(arr);

        // finding the duplicate
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {1, 4, 5, 1, 6, 4, 8};

        findDuplicate(number);
    }
}
