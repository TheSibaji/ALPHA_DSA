package Recursion;

public class sum_of_n_natural_num {

    // sum of n natural numbers
    public static int sumof_nat_Num(int n){
        // base case
        if(n == 1){
            return 1;
        }
        int s = sumof_nat_Num(n-1);
        int sum = n + s;            //in course solution

        // int sum = n + sumof_nat_Num(n-1);    //my solution
        return sum;
    }


    public static void main(String[] args) {
        int n=5;

        System.out.println(sumof_nat_Num(n));
    }
}
