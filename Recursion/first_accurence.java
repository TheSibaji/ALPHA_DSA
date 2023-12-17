package Recursion;

public class first_accurence {

    // find the first occurence of a number in an array
    public static int firstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccur(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 12, 5, 73, 5, 51, 4, 6, 1};

        System.out.println(firstOccur(arr, 1, 0));
        System.out.println(firstOccur(arr, 5, 0));
        System.out.println(firstOccur(arr, 04, 0));
    }
}
