package Arrays;

public class reverseArray {
    public static void RevArr(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int temp;

        while (start < end) {     //swap numbers first to last & last to first
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++; //updating first index
            end--;   // updating last index
        }
    }
    public static void main(String[] args) {
        int numbers[] = {12, 34, 45, 56, 67, 78, 89, 90};
        
        System.out.print("The present array: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        RevArr(numbers);    // Calling the reverse array function

        System.out.print("The reverse array: ");   // Print the reverse array
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
