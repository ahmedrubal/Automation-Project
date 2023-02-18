package Modifiers;

public class Publicmodifiers {
    public String country = "usa";
    public void method1(){//when you create a public method or variable in your class you can use this method and variables..
        int i= 10;// across any package and any class .
        System.out.println(i);
    }

    public static void main(String[] args) {
        Publicmodifiers obj1 = new Publicmodifiers();
        obj1.method1();
        System.out.println(obj1.country);

    }
}
