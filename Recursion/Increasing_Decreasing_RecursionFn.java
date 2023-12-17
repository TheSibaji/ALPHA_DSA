package Recursion;

public class Increasing_Decreasing_RecursionFn {
    // function to print n of number in decreasing order
    public static void decOrder(int n){
        // Base case
        if(n == 1 ){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decOrder(n-1);      //function calling itself by decreasing 1 in each function
    }

    // function to print n of number in increaging order
    public static void incOrder(int n){
        // base case
        if(n == 1){
            System.out.print(n);
            return;
        }
        incOrder(n-1);
        System.out.print(" "+n);
    }


    public static void main(String[] args) {
        int n = 10;

        decOrder(n);
        System.out.println();
        incOrder(n);

    }
}

