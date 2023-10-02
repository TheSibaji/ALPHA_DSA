package Strings;

public class Substring {
    public static String subString(String str, int si, int ei){     //si for starting index & ei for ending index
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        // predefined substring function
        System.out.println(str.substring(0, 5));

        // function that I create
        System.out.println(subString(str, 0, 5));
    }
}
