package Arrays;

public class prefixArraySum {

    public static void prefixArr(int arr[]){
        int currSum = 0;
        int maxSubArr = Integer.MIN_VALUE;
        int minSubArr = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];

        // calculating prefix
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;

                // // for print all subarrays
                // int temp = 0;
                // for(int k=start; k<=end; k++){          
                //     System.out.print(arr[k]+" ");

                //     temp += arr[k];     
                //     currSum = temp;
                // }
                // System.out.println();
                // //  print sum of all sumarrays
                // System.out.println("The sum of this sub array is: "+currSum);

                currSum = start==0? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSubArr < currSum){
                    maxSubArr = currSum;
                }
                if(minSubArr > currSum){
                    minSubArr = currSum;
                }
            }
            // System.out.println();
        }
        System.out.println("Max Sum: "+maxSubArr);
        System.out.println("MIn Sum: "+ minSubArr);
    }
    public static void main(String[] args){
        int nums[] = {1, -8, 7, -2, 3, 4};
        prefixArr(nums);
    }
}
