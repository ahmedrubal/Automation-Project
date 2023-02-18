package Polymarphisom;
  //In java two type of polymarphisom available. 1. Method overloading 2,Method overriding
//This is method overloading.
//In polymarphisom we have same method name but data type and number of parameter must be diffrent.
public class Polymphisom {
//    void add(int num1 ){
//      //  System.out.println(num1+num2);
////
////    }
//   public void add(int num1,int num2 ,int num3){
//        System.out.println( num1 + num2 + num3);
//
//    } void add(int num1,int num2 ){
//          System.out.println(num1 + num2 );


//    }
//    static void money(int num1,int num2, int num3){
//        System.out.println(num1+num2);
//
//    }
////    static void money(int num1,int num2,int num3){
////        System.out.println(num1+num2);
////
////    }
//
//    public static void main(int num1 ) {
//        System.out.println(num1);
//
//    }
        void add(int num1 ){
             System.out.println(num1);

        }
         void add(int num1,int num2 ,int num3){
              System.out.println( num1 + num2 + num3);

          }
          void add(int num1,int num2 ){
              System.out.println(num1 + num2 );}

    public static void main(String[] args) {
        Polymphisom obj = new Polymphisom();
        obj.add(10);
        obj.add(20,30);
        obj.add(10,20,30);
//
//        Polymphisom.money(10,30);
//        Polymphisom.main(10);


    }
}
