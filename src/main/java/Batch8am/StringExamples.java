package Batch8am;

public class StringExamples {
    public static void main(String[] args) {

        String s1 = null;
        String s2 = "Java";
        String s3 = "  welcome java  ";
        String s4 = "welcome java in 2019";
        int s5 = 2019;
        try {System.out.println(s1.length()); //while we put a variable value null then it throw a exception
                // called NullPointerException we can handle that code put in the try block and put occurs exception in catch block
        }catch (NullPointerException e){
            System.out.println(e);

        }

       // System.out.println(s1.length());

       /* System.out.println(s1.equals(s2));//boolean type false
        System.out.println(s1.equalsIgnoreCase(s2)); //boolean type true
        System.out.println(s1.contains("java")); //boolean type true
        System.out.println(s3.contains("welcome"));

        System.out.println(s3);
        System.out.println(s3.trim());//purpose of use trim is delete space front and last
        System.out.println(s3);//no modification available in string in java
        System.out.println(s4.length());
        System.out.println(s3.length()); //space also count as a character or length
        System.out.println(s1.indexOf("v")); //first character is index 0 and last size -1
        System.out.println(s4.indexOf("a")); //first index of a
        System.out.println(s4.lastIndexOf("a")); //last index of a
        System.out.println(s1.charAt(1)); // get character from index number
        System.out.println(s1.indexOf("w")); // while character not there output -1
        System.out.println(s1.codePointBefore(2));
        System.out.println(s1.codePointAt(1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s2.endsWith(s5));
        char[] arr = s1.toCharArray(); // divided every character in a array we use tochararray method
        for (char c : arr) {
            System.out.println(c);

        }
        String[] arr1 =s4.split(" ") ; // split method use to seperate a whole string into a diffrent diffrent string basic  of spaces in the string

        System.out.println(arr1.length);  // or whatever values you put inside " "
        for (String s : arr1) {

                System.out.println(s);
        }
        Character c = 'a';
        System.out.println("Asci :"+ (int)c );*/
    }
}
