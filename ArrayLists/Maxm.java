package ArrayLists;

import java.util.ArrayList;

public class Maxm {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(6);

        // int max = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){

            // if(list.get(i) > max){
            //     max =list.get(i);
            // }
            max = Math.max(max, list.get(i));
            
        }
        System.out.println("The max element in this list is: "+max);
    }
}
