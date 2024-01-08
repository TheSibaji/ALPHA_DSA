package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Swap2Num {
    // swappint the element of list
    public static void swapp(ArrayList<Integer> list , int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(78);
        list.add(56);
        list.add(14);

        int idx1 = 1, idx2 = 3;

        System.out.println("Original list: "+list);
        System.out.print("After swapping: ");
        swapp(list, idx1, idx2);

        // // sorting an arraylist
        Collections.sort(list);
        System.out.println("Sorted list: "+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decending order sort: "+list);
    }
}
