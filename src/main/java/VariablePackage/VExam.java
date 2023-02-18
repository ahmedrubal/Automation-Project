package VariablePackage;

public class VExam {
    String country = "BANGLADESH"; //instance variable
    static String country1 = "UK";  //static variable



    void method1(){
        int a = 10;
        int b = 10;
        System.out.println(a+b);
        System.out.println(country);
        System.out.println(country1);
    }
    void method2(){
        String name = "usa";
        System.out.println(name);
        System.out.println(country);
        System.out.println(country1);
    }
    static void method3(){
        String student = "Cuny";
        System.out.println(student);
        VExam obj = new VExam();
        String country = "BANGLADESH";
        System.out.println(country);
        System.out.println(country1);
        String language = m4();
        System.out.println(language);

    }
    static String m4(){
        return   "java";
    }




    public static void main(String []args){
        VExam obj = new VExam();
//        obj.method1();
//        obj.method2();
//       VExam.method3();

       




    }
}
