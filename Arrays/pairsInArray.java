package Arrays;

public class pairsInArray {

    public static void Pairs(int arr[]){
        int totalPairs = 0; //initializing the count of pairs
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");

                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+totalPairs);
    }
    public static void main(String[] args) {
        int number[] = {1, 5, 3, 6, 8, 9};
        Pairs(number);
    }
}
