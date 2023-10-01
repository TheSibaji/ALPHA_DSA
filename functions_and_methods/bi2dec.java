package functions_and_methods;

public class bi2dec {
    // Logic
    public static int binDec(int binNum){
        int decimal = 0;
        int power = 0;
        
        while(binNum > 0){
            int ldig = binNum % 10;
            decimal = decimal + (ldig * (int) Math.pow(2, power));
            power++;
            binNum =binNum/10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int number = 10100;
        
        System.out.println("The decimal number of "+number+" is: "+binDec(number));
    }
}