package Modifiers;

public class privatemodifier {// if you make any method or variables private then you can access in the same package within the diffrent class..
                             // .but you are not able to access these method.
    private String one = "java";//or variables any other packages and classess except making it subclass(inheritane parent/child)
    private static int two = 100;



      private void m1 () {
            int roll = 10;
            System.out.println(one);
            System.out.println(two);
        }
        private void m2(){

            System.out.println(two);
        }




  public static void main(String[] args) {
      privatemodifier obj2 = new privatemodifier();
     obj2.m1();
      System.out.println(obj2.one);
  }

}
