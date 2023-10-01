package functions_and_methods;

public class prime_in_Range {

    // Optimal Solution FOR PRIME NUMBER
    public static boolean PrimeNum(int n){
        // best case
        if(n==2){
            return true;
        }
        // logic
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    // prime numbers in N range
    public static void primesinRange(int n){
        for(int i=0; i<=n; i++){
            if(PrimeNum(i) == true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 30;

        primesinRange(n);
    }
}
