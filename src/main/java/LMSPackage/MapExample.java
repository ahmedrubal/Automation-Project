package LMSPackage;

import java.util.HashMap;

public class MapExample {
    public static void main(String[]args){
        HashMap<String,String> map1 = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();
        map1.put("Nisan","Maxima");
        map1.put("Toyota","Camry");
        map1.put("","");
        map1.put("Null","");
        map1.put("Bmw","M5");
        map1.values();
        for (int m=1;m<map1.size();m++){
            System.out.println(m);
        }
        System.out.println(map1);
        System.out.println(map1.replace("","","New Value"));
        System.out.println(map1);
        System.out.println( map1.containsKey("Nisan"));
        System.out.println(map1.containsValue("Maxima"));
        System.out.println(map1.isEmpty());
        map1.putIfAbsent("Volvo","Unknown");
        System.out.println(map1.containsValue("Unknown"));
        System.out.println( map1.remove("Volvo","Unknown"));
        map2.putAll(map1);
      System.out.println( map2.size());
      System.out.println(map1.size());

    }
}
