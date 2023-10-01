package Arrays;

public class smallestInArray {
    public static void smallNum(int arr[]){
        int small = arr[0];
        int temp;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < small){
                temp = small;
                small = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("The smallest number in this array is: "+small);
    }
    public static void main(String[] args){
        int arr[] = {12, 45, 78, 35, 65, 78, 20, 47, 36};
        smallNum(arr);
    }
}
