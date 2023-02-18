package LMSPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListExample {

    public static  void main(String[] args) {


      // ArrayList<Integer> list1 = new ArrayList<>();
      //  ArrayList <Integer> list2 = new ArrayList<>();
     LinkedList<Integer> list1 = new LinkedList<>();
       LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(55);
        list1.add(30);
        list1.add(20);
        list1.add(11);
        list1.add(20);
        list1.add(30);

        list2.add(40);
        list2.add(60);
        list2.add(15);
        list2.add(0);
       list2.addAll(list1);
        // list2.remove(0);
         list2.retainAll(list1); //retain use list to delete and keep list1 data in list2 method
        // list1.clear();
       // list2.add(0,10 );


        System.out.println(" List 2 size is :: " + list2.size());
        System.out.println(list2);
       /* list2.removeAll(list1);
        System.out.println(" List 2 size is :: " + list2.size());

     for (int data : list2) {  // foor each loop
         System.out.println(data);
        }
        for (int i = 0; i < list2.size(); i++) { //for loop
            System.out.println(list2.get(i));
        }
       ListIterator<Integer> itr = list2.listIterator();
       // Iterator<Integer> itr = list2.iterator();
        Iterator<Integer> itr = list2.descendingIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        list2.addAll(list1);
        System.out.println("list 2 size" + list2.size());
        list2.add(0,10);
        System.out.println(list2); // just print the list
        //list2.clear();
        System.out.println(list2);
        System.out.println(list2.contains(10)); //return type true or false
       // System.out.println(list2.clone()); // print the copy of element in the list
        list2.clear(); //clear the entire list
        System.out.println("list 2 size" + list2.size());
      // System.out.println(list2.remove()); // remove first element from the list
       System.out.println(list2.isEmpty()); // return type is boolean true/false
      //  System.out.println(list2);
      //  System.out.println(list2.size());





       while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }*/
        

    }


}


