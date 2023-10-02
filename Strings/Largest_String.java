package Strings;

public class Largest_String {
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};

        String largString = fruits[0];     //let the first string is the largest, then compair it using a for loop
        for(int i=1; i<fruits.length; i++){
            if(largString.compareTo(fruits[i]) < 0){
                largString = fruits[i];
            }
        }
        System.out.println(largString);
    }
}
