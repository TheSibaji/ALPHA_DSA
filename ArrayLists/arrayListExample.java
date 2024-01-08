package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Syntax
        // ArrayList<Integer> list = new ArrayList<Integer>(2);
        
        // // list.add(67);
        // // list.add(12);
        // // list.add(98);
        // // list.add(23);
        // // list.add(45);

        // // System.out.println(list);
        // // System.out.println(list.contains(12));      //true
        // // System.out.println(list.contains(13));      //false

        // // list.set(0, 100);

        // // System.out.println(list);

        // // list.remove(0);
        // // System.out.println(list);

        // // input-------------------------------------------------+++++++++++++++++++++++++++++++++++++++++++++++++++
        // System.out.println("Enter the list of number: ");
        // for(int i=0; i<5; i++){
        //     list.add(sc.nextInt());
        // }
        // System.out.println("The list: "+list);

        // // get item at any indext
        // for(int i=0; i<5; i++){
        //     System.out.println(""+list.get(i));    //pass index here, list[index] syntax will not work here
        // }


        // ::::::: Multiple ArrayList :::::::::::::::
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        
        // initialization
        for(int i=0; i<3; i++){
            list2.add(new ArrayList<>());  //Adding ArrayLists in side of  a ArrayList..  e.g => [ [1,2,3], [4,5,6], [7,8,9] ]
        }

        // add element
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list2.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list2);

        sc.close();
    }

}