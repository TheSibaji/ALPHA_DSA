package Strings;

public class palidrome {
    public static boolean isPalindrome(String name){

        for(int i=0; i<name.length()/2; i++){
            if(name.charAt(i) != name.charAt(name.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "racecar";
        String name2 = "noan";
        String name3 = "madam";

        System.out.println(isPalindrome(name));
        System.out.println(isPalindrome(name2));
        System.out.println(isPalindrome(name3));
    }
}
