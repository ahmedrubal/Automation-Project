package LoopingPackage;


public class LoopingStatements {

    public static void forLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("value for i " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println("value F " + j);
            }
            System.out.println("outside j for loop");
        }
        System.out.println("outside for Loop");

    }

    public static void whileLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println("value is " + i);
            i++;
        }
        System.out.println("outside while loop");

    }

    public static void DoWhileLoop() {
        int i = 1;
        do {
            System.out.println("value is " + i);
            i++;
        } while (i <= 10);
        System.out.println("outside doWhile");


    }
    public static void continueStatement(){
        for(int i = 1; i <= 10; i++){
            if(i==5 || i==8 | i == 9){
                continue;
            }
            System.out.println("value for i ::" +i );
        }
        System.out.println("outside for loop");
    }
    public static void BreakStatement(){
        for(int i = 1; i <=10; i++){
            System.out.println("before break ::" + i);
            if( i ==5){
                break;
            }
            System.out.println("after break  ::" + i);
        }
        System.out.println("outside for loop");
    }


    public static void main(String[] args) {
       // forLoop();
        // whileLoop();
        //  DoWhileLoop();
        continueStatement();
         BreakStatement();


    }
}
