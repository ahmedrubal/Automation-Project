package Modifiers;

public class Test01 {



    public static void main(String[]args){
        Defaultmodifiers obj = new Defaultmodifiers();
        obj.m1();
        System.out.println(obj.one);
        Publicmodifiers obj1 = new Publicmodifiers();
        obj1.method1();
        System.out.println(obj1.country);
        Protected obj3 = new Protected();
       obj3.usa();



      

    }
}
