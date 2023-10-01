package Arrays;

public class kadane_max_subArr_sum {
    
    // Kadane's rule for max subarr sum
    public static void Kadane(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(currSum < 0){
                currSum = 0;
            }

            // if(currSum > maxSum){
            //     maxSum = currSum;
            // }

            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max sum: "+maxSum);
    }
    public static void main(String[] args){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadane(numbers);
    }
}
