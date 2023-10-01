package Arrays;

public class subsArray {

    public static void printSubarr(int arr[]){
        int tsubarr = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;

                int temp = 0;
                for(int k=start; k<=end; k++){ // this loop is for only print the elements
                    System.out.print(arr[k]+" ");  //subarrys

                    temp += arr[k];     
                    sum = temp;         //sum of each subarrays
                }
                tsubarr++;
                System.out.println();
                System.out.println("The sum of this sub array is: "+sum);
            }
            System.out.println();
            
        }
        // System.out.println("Number of total subarrays: "+ ((arr.length) * (arr.length + 1)/2 ) );
        System.out.println("The total subarays: "+tsubarr);
        
        


    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 8, 7};
        printSubarr(numbers);
    }
}
