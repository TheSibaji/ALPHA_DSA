package Strings;

public class Practice {
    public static void printchar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
        String name = "Sibaji";
        // System.out.println(name.charAt(2));
        printchar(name);
    }
}
