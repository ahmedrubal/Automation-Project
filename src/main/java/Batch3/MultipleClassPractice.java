package Batch3;

public class MultipleClassPractice {
    void  two(){  //string class practice
    String usa = "java";
    String usa1 = "python";
    String usa2 = "cucumber";
        System.out.println(usa.length());
        System.out.println(usa.lastIndexOf("a"));
        System.out.println(usa1.charAt(2));

    }
     void three(){
        int m = 10; // variable example /local variable
         System.out.println(m);
    }
    void four(){
        int[] arr1 = new int[3]; //array example
        arr1[0] =10;  // data insertion
        arr1[1] = 20;

        int m =arr1[0];  // data retrival
        int m1 =arr1[1];
        System.out.println(arr1[0]);
        System.out.println(m1);
      //  System.out.println(arr1.length);
    }
    static void Conditional(int marks){

        if(marks>= 50){
            System.out.println("student pass ::"+ marks);
            if(marks==60){               //nested condition
                System.out.println("grade a :" + marks);
            }else {System.out.println("diffrent grade  :" + marks);

            }
        }else {
           System.out.println("student is failed::"+ marks);
        }
    }



    public static void main(String[]args){
       MultipleClassPractice exam = new MultipleClassPractice();  // in same class we can create multiple obeject
       MultipleClassPractice exam1 = new MultipleClassPractice();

      // exam.two();
    //  exam1.three();
     //  exam.four();
       MultipleClassPractice.Conditional(60);
    }
}

