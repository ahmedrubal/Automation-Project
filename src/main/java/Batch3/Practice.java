package Batch3;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.File;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Practice {
    public static void main(String[] args) {
        String arr = "Ahmed";
        String rev ="";
        for (int i =arr.length()-1; i>=0; i--){
            System.out.println(i);
            rev=rev+arr.charAt(i);
        }
        System.out.println(rev);
        int []arr1 = {4,3,8,3,0,-1};
        int max =arr1[0];
        for (int j : arr1) {
            if (j < max) {
                max = j;
            }
        }
        System.out.println(max);
        String f = " rahimahmed ";
        String f2 = "fahim";
        System.out.println(f.charAt(2));
        System.out.println(f.concat(f2));
        System.out.println(f.codePointCount(1,4));
        System.out.println(f.replace("d","f"));
        System.out.println(f.contains("g"));
        System.out.println(f.hashCode());
        String tri = f.trim();
//        System.out.println(tri);
//    String [] sp = f.split("h",4);
//        System.out.println(sp[0]);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add(null);
        arr2.add(null);
        ArrayList<String> arr4 = new ArrayList<>();
        arr4.add("hafic");
        arr4.add("hafic");
        System.out.println( arr2.addAll(arr4));
        System.out.println(arr);
        HashSet<String> se = new HashSet<>();
        se.add("lsaik");
        se.add("abu");
        se.add("nasir");
        se.add("fahim");

        se.add(null);
        se.add(null);
        se.remove(null);
       Iterator<String> it = se.iterator();
       while (it.hasNext()){
           System.out.println(it.next());

//           if (it.next()!="abu"){
//               break;
//           }

       }
        System.out.println(se.size());
      //  System.out.println(it.next());
       HashMap<String ,String> ma = new HashMap<>();
        ma.put("county", "bronx");
        ma.put("c", "bronx");
        ma.put("null",null);
        ma.put("k",null);
        System.out.println(ma.putIfAbsent("n","sahim"));
        System.out.println(ma.size());
        System.out.println( ma.containsValue("bronx"));
        Set<String > s = ma.keySet();
        Iterator<String> i = s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
       Collection<String> va =  ma.values();
       Iterator<String> value = va.iterator();
       while (value.hasNext()){
           System.out.println(value.next());
       }
        //System.out.println(ma.putIfAbsent("n","sahim"));


    }WebDriver driver = null;
    String filepath = "C:\\Users\\Rubal Ahmed\\Desktop\\screen shot picture";

    TakesScreenshot src = ((TakesScreenshot)driver);
    File dest = src.getScreenshotAs(OutputType.FILE);
    File de = new File(filepath+"picture"+ System.currentTimeMillis()+".png");



}
