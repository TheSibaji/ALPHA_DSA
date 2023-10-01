package functions_and_methods;

public class dec2bi {
    // Logic
    public static int Dec2Bin(int DecNum){

        int power = 0;
        int BinNum = 0;

        while(DecNum>0){
            int remender = DecNum%2;

            BinNum = BinNum + (remender * (int)Math.pow(10, power));
            
            power++;
            DecNum = DecNum/2;
        }
        return BinNum;
    }
    public static void main(String[] args) {
        int decNum = 7;
        System.out.println("Binary form of "+decNum+" is: "+Dec2Bin(decNum));
    }
}
