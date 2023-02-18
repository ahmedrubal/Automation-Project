package InheritancePackage;

import InterfacePackage.InterfaceThree;

public class Animal implements InterfaceThree { //implements keyword use for class and interface .
    public  void walk(String name) {
        System.out.println(name + "can walk");
    }
    public  void eat(String name){
        System.out.println(name + "can eat");
    }
    public  void run(String name){
        System.out.println(name+ "can run");
    }

    @Override
    public void m4() {
        System.out.println( "i am method m4");

    }

    @Override
    public void m5() {
        System.out.println( "i am method m5");


    }

    @Override
    public void m6() {
        System.out.println( "i am method m6");


    }

    @Override
    public void m1() {
        System.out.println( "i am method m1");


    }

    @Override
    public void m2() {
        System.out.println( "i am method m2");


    }

    @Override
    public void m3() {
        System.out.println( "i am method m3");


    }
}
