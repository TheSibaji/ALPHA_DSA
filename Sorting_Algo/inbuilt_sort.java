package Sorting_Algo;

import java.util.Collections;
import java.util.Arrays;


public class inbuilt_sort {

    // just a print function
    public static void printF(Integer a[]){
        System.out.println("The sorted array: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {5, 4, 1, 2, 3};

        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 4);
        
        // Arrays.sort(arr, Collections.reverseOrder());   
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        printF(arr);
    }
}
