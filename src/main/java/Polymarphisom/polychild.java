package Polymarphisom;

public class polychild extends polyparent {// For method overriding must we have to extends child class with parent class.
    public void m1(){//Method name must have to be same and return type of method should be same
        System.out.println("i am method m1 in child class");
    }
    public String m2( String name ,int x){//number of parameter and type and order should be same for method overriding.
        System.out.println("i am method m2 in child class");
         return "java";
    }
    public static void main(String[] args) {
        polychild child = new polychild();
        child.m1();
        child. m2(10,"Bangladesh");


//       polyparent parent = new polyparent();//also we can run parent class properties here in child class.
//       parent.m1();

    }
}
