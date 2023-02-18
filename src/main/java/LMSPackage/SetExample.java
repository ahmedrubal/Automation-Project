package LMSPackage;

import java.util.*;

public class SetExample {
    public static  void main(String[]args){
       HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(10);
        set1.add(20); //Hash set doesn't maintains insertion odrer and no duplicate data will be printed every time.
        set1.add(10); // duplicate data will be printed one time only.

        set2.add(40);
        set2.add(60);
        set2.add(40);
       set1.addAll(set2);
        System.out.println(set1.size());
        // set1.retainAll(set2);
        //   set1.clear();

        for(int data: set1){
            System.out.println(data);
        }
        System.out.println();

        LinkedHashSet<Integer> LHS1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> LHS2 = new LinkedHashSet<>();
        LHS1.add(20);  // maintains insertion order and remaining methods are same. that is the only difference.
        LHS1.add(20);
        LHS1.add(10);

        LHS2.add(40);
        LHS2.add(60);
        LHS2.add(40);
       LHS1.addAll(LHS2);
        System.out.println(LHS1.size());
       // LHS1.retainAll(LHS2);
     //   LHS1.clear();





        for(int data: LHS1){
            System.out.println(data);
        }
        TreeSet<Integer> TRE1 = new TreeSet<>();
        TreeSet<Integer> TRE2 = new TreeSet<>();
        TRE1.add(10);  // maintains ascending order and remaining methods are same. that is the only difference with other two
        TRE1.add(20);
        TRE1.add(10);

        TRE2.add(40);
        TRE2.add(60);
        TRE2.add(40);
        TRE1.addAll(TRE2);
        System.out.println(TRE1.size());
        // LHS1.retainAll(LHS2);
        //   LHS1.clear();
        Iterator<Integer> iterator = TRE1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());}





      /*  for(int data: TRE1){
            System.out.println(data);
        }*/


    }
}
