package Bit_Manupulation;

public class Operations {
    // get ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return (n | bitMask);
    }

    // clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));   //set ith bit
        System.out.println(setIthBit(10, 2));    //get ith bit
        System.out.println(clearIthBit(10, 1));    // clear ith bit
    }
}
