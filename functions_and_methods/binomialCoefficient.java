package functions_and_methods;

public class binomialCoefficient {

    // funtion for find factorial 
    public static int factor_ial(int n){
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    // binomial coefficient function
    public static int Binomial_coff(int n, int r){
        int f_n = factor_ial(n);
        int f_r = factor_ial(r);
        int f_nr = factor_ial(n-r);
        System.out.println("Factorial of "+"n: "+ f_n);
        System.out.println("Factorial of "+"r: "+ f_r);
        System.out.println("Factorial of "+"c-r: "+ f_nr);

        // binomial 
        int binoml_Coff = f_n / (f_r * f_nr);

        return binoml_Coff;
    }


    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        
        System.out.println("The binomial coefficient of "+n+" is: "+Binomial_coff(n, r));
    }
}