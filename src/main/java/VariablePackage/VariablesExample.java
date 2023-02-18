package VariablePackage;


public class VariablesExample {
    String name = "java"; //instance variable
static String country = "india"; //static variables

    void m1(){
      int rno = 10; //local variables
        System.out.println(rno); //local variables

        System.out.println(name );
        System.out.println(country);
    }
    void m2 (){
        int rno = 10; //local variables
        System.out.println(rno); //local variables
        System.out.println(name);
        System.out.println(country);

    }
    static void m3(){
       VariablesExample obj = new VariablesExample();
        System.out.println(obj.name);
        System.out.println(country);
     String language = m4();
        System.out.println(language);

    }
  static String m4(){
        return "java";

    }




public static void main(String[] args){
       VariablesExample obj = new VariablesExample();

 // VariablesExample.m3();
  // obj.m1();
   obj.m2();






}
}
