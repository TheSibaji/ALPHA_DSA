package Recursion;

public class fibonacci_of_Nth_num {

    // print Nth fibonacci number
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fib_1 = fibonacci(n-1);
        int fib_2 = fibonacci(n-2);

        int final_Fib = fib_1 + fib_2;

        return final_Fib;
    }


    public static void main(String[] args) {
        int n=5;

        System.out.println(fibonacci(n));
        System.out.println(fibonacci(12));
        System.out.println(fibonacci(13));
        System.out.println(fibonacci(14));
    }
}
