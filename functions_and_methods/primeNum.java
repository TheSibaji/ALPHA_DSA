package functions_and_methods;

public class primeNum {

    // // check prime
    // public static boolean PrimeNum(int n){
    //     boolean isprime = true;
    //     for(int i=2; i<=n-1; i++){
    //         if(n%i == 0){
    //             isprime = false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // }
    

    // Optimal Solution
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

    public static void main(String[] args) {
        int k = 6;

        System.out.println(PrimeNum(k));
    }
}