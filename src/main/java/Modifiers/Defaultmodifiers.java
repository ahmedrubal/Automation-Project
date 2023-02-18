package Modifiers;

public class Defaultmodifiers {
    String one= "five";
   void m1(){  // when you create a method without public, private and protected access modifiers then java consider it ...
        int roll = 12;   //as a default modifiers and you can run it at same class and class within the same package but you have to create..
        System.out.println(roll);// an object of the class in which class you want to run your code.

    }




    public static void main(String[] args) {
       Defaultmodifiers obj = new Defaultmodifiers();
       obj.m1();
       System.out.println(obj.one);
   }
}
