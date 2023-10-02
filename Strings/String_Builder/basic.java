package Strings.String_Builder;

public class basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);   //add one by one
        }
        //Here time Complexcity: O(26)
        System.out.println(sb);
        System.out.println(sb.length());    //length of the string

        // delete 'y'
        sb.deleteCharAt(24); //24 because index start from 0
        System.out.println(sb);

        // delete in a range
        sb.delete(2, 5);    //c d e "Bcause it start from 2 and end before 5"
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
