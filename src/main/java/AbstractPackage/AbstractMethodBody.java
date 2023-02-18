package AbstractPackage;

public class AbstractMethodBody extends AbstractClass {//abstract class must extends with  ..
    //method body declaration class
    void m1(){//here we declare abstract method m1 body but we can not use abstract keyword for this method
        System.out.println("i am  abstract method body ");
    }
    public static void main(String[] args) {//here we are able to run void m1 method just create an object
        AbstractMethodBody obj = new AbstractMethodBody();
        obj.m1();


    }
}
