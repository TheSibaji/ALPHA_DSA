package Bit_Manupulation;

// import java.util.Scanner;

public class Check_OddEven {
    public static void OddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            // Even
            System.out.println(n+" is a even number");
        }
        else{
            //Odd
            System.out.println(n+" is a odd number");
        }
    }

    public static void main(String [] args){
        // with user input
        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.print("Enter a number: ");
        //     int n = sc.nextInt();
            
        //     OddEven(n);
        // }

        OddEven(0);
        OddEven(1);
        OddEven(19);
        OddEven(30);
    }
}
