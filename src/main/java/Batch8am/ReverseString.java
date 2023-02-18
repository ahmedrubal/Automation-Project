package Batch8am;


import com.sun.xml.internal.fastinfoset.util.CharArray;

public class ReverseString {
   public static void main(String[] args) {

        //reverseStringUsingCharArray();
        reverseString();
       // System.out.println(reverseStringUsingStringBuilderClass(  "Name" ));


    }
    // THIS IS REVERSE A STRING USING STRING CONCATENATION OPERATOR AND USING charAt() method
    public static void reverseString(){
        String str = "india";
        String rev="";
        int ln = str.length();
        System.out.println(ln);
        for(int i =ln-1; i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse String is :" + rev);

    }
    public static void  reverseStringUsingCharArray(){
        String str = "Bangladesh";
        // this is an empty string storing into rev variable and later iside the loop we are storing value
        String rev="";
        char [] a = str.toCharArray();
        // we can use str.length() or a.length;
        int len =a.length;//this line add in the code to put in the loop to get  character in reverse order
        System.out.println(len); //this line just to see the length of a toCharArray

        for (int i =len-1;i>=0;i--){
            rev=rev + a[i]; //Here we can use array a[i] or str.charAt(i) method both will work
        }
        System.out.println("Reverse String is :" + rev);
    }


    //Easiest way to reverse a string using StringBuilder Class
    public static String reverseStringUsingStringBuilderClass(String student){
        StringBuilder str = new StringBuilder(student);
        str.reverse();
        return str.toString();
    }

}
