package Recursion;

public class factorial_of_N {

    // factorial of number n.    || (n!)    || n(n+1)/2 formula
    public static int factorial_N(int n){
        // base case
        if( n == 0){
            return 1;
        }
        
        int fnm1 =  factorial_N(n-1); 
        int fn = n * fnm1;                  //course solution

        // int fn = n * factorial_N(n-1);   //my solution
        return fn;
        
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(factorial_N(n));
    }
}
