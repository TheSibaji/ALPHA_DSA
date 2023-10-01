package Arrays;

import java.util.Scanner;

public class linearSearch {

    // linear search function
    public static int LinearSrch(int arr[], int key){
        // logic
        for(int i=1; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 78, 25, 36, 88, 22, 78};

        try (   // let's take key input from the user
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number that you want to find: ");
            int key = sc.nextInt();

            // Calling the function and store in a variable 
            int index = LinearSrch(arr, key);
            if(index == -1){
                System.out.println("The number "+key+" is not found in this array.");
            }
            else{
                System.out.println("The number "+key+" is present at location "+index);
            }
        }
    }
}
