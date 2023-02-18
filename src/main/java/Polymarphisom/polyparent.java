package Polymarphisom;

public class polyparent
{ // This is runtime polymarphisom also called method overriding. Exactly how we declared a ..
    public void m1() {//method in parent class exactly same we have to declare in child class as well.
        System.out.println("i am m1 method in parent class");
    }
    public String m2(int x, String name){
        System.out.println("i am m2 method in parent class");
        return "java";
    }
    // static method is not possible for method overriding into child class but we can run static method here in parent
    //class .
    public static void m3(String moon){
        System.out.println("i am static method");
    }





    public static void main(String[] args) {// we can run parent class here to make object of a class.
        polyparent parent = new polyparent();
        parent.m1();
        parent.m2(10,"Bangladesh");
       polyparent. m3("chad");

    }
}
