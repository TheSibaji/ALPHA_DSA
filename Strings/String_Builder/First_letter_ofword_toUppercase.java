package Strings.String_Builder;

public class First_letter_ofword_toUppercase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        // char ch = Character.toUpperCase(sb.charAt(0));
        // sb.append(ch);

        // for(int i=1; i<str.length(); i++){
        //     if(str.charAt(i) == ' ' && i < str.length()-1){
        //         sb.append(str.charAt(i));
        //         i++;
        //         sb.append(Character.toUpperCase(str.charAt(i)));
        //     } else{
        //         sb.append(str.charAt(i));
        //     }
        // }
        // return sb.toString();


        if (str.length() > 0) {
            sb.append(Character.toUpperCase(str.charAt(0)));
        }

        for (int i=1; i<str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i)))      // we can use these: || str.charAt(i) == ',' || str.charAt(i) == '.'
            {
                sb.append(str.charAt(i));
                i++;
                if (i < str.length()) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am sibaji";

        System.out.println(toUpperCase(str));
    }
}
