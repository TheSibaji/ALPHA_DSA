package Bit_Manupulation;

public class BinaryNumberSystem {
    // BINARY AND " & "
    public static void binaryAND(int x, int y){
        // Rules
        //     0 & 0 -> 0
        //     0 & 1 -> 0
        //     1 & 0 -> 0
        //     1 & 1 -> 1

        System.out.println("Binary AND: "+ (x & y));
    }

    // BINARY OR " | "
    public static void binaryOR(int x, int y){
        // Rules
        //     0 & 0 -> 0
        //     0 & 1 -> 1
        //     1 & 0 -> 1
        //     1 & 1 -> 1

        System.out.println("Binary OR: "+ (x | y));
    }

    // BINARY XOR " ^ "
    public static void binaryXOR(int x, int y){
        // Rules
        //     0 & 0 -> 0
        //     0 & 1 -> 1
        //     1 & 0 -> 1
        //     1 & 1 -> 0

        System.out.println("Binary XOR: "+ (x ^ y));
    }

    // BINARY ONE'S COMPLEMENT " ~ "
    public static void binaryONEsCOMP(int x){
        // Rules
        //     ~0 -> 1
        //     ~1 -> 0
        //it works with ingle element
        System.out.println("Binary ONE'S Comp.: "+ (~x));
    }

    // BINARY LEFT SHIFT
    public static void binaryLeftShift(int x, int y){
        // Rules
        //     a << b
        // formulla: 
        //      a << b = a*(2^b)   [^b is power of 2]
        
        System.out.println("Binary Left Shift: "+ (x << y));
    }

    // BINARY RIGHT SHIFT
    public static void binaryRightShift(int x, int y){
        // Rules
        //     a >> b
        // formulla: 
        //      a >> b = a/(2^b)   [^b is power of 2]
        
        System.out.println("Binary Right Shift: "+ (x >> y));
    }
    public static void main(String args[]){
        int a = 5; int x = 2;
        int b = 6; int y = 1;

        
        // calling the functions
        binaryAND(a, b);
        binaryOR(a, b);
        binaryXOR(a, b);
        binaryONEsCOMP(a); //it works with ingle element
        binaryLeftShift(a, x);
        binaryRightShift(b, y);
    }
}
