package Encapsulation;

public class Test2   {//As we already know private modifiers accesible only same class but using encapsulation
    //we are accesing private variables into diffrent class within same package.

    public static void main(String[] args) {//Here we create obj for encap class and set setter method value
        //and print out by using getter method
        Encap obj = new Encap();
       obj.setUk("london");

        System.out.println(obj.getUk());


    }
}
