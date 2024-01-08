package ArrayLists;

import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        // java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);   //to print the list

        list.remove(2);
        System.out.println(list);
        System.out.println("Size of the list: "+list.size());   //it return size of the arraylist
        System.out.println("element at 0th position: "+list.get(0)); //it return the element/object

        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        System.out.println(list.contains(7)); //it return true/false
        System.out.println(list.contains(9));

        list.set(2, 20);
        System.out.println(list);

        // we can perform may operation like
        // add remove size  iterate addAll removeAll clear contains etc...


        // print the arraylist
        System.out.println("\nArray list: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
