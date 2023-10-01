package Arrays;

public class largestInArray {
    // function
    public static void LargNum(int arr[]){
        int larg = arr[0];
        int temp;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > larg){
                temp = larg;
                larg = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("The largest number in this array is: "+larg);
    }
    public static void main(String[] args){
        int arr[] = {12, 55, 78, 32, 12, 55, 96, 78, 111, 10, 2};
        LargNum(arr);
    }
}
