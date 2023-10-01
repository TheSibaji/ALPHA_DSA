package functions_and_methods;

import java.util.Scanner;

public class factorial{

    // funtion for find factorial 
    public static int factor_ial(int n){
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String args[]){
        
        try(
        Scanner ob = new Scanner(System.in);){
        System.out.print("Enter a number: ");
        int num = ob.nextInt();

        System.out.println("Factorial of "+" n is: "+factor_ial(num));
        }
    }
}

