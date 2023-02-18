package Batch8am;

public class ConditionalStatements {
    public static void ifCondition(int marks){
        if(marks >= 40){
            System.out.println("student is passed with marks ::" + marks);
        }else{
            System.out.println("student is failed with marks ::" + marks);
        }

    }
    public static void elseifCondition(int m){
        if(m >=40 && m<=60){
            if(m==40){ //nested statement
                System.out.println("passed with border" + m); //nested statement
            }else { //nested statement
                System.out.println("student c" + m); //nested statement
            }

        }else if(m>=60 && m<=80){
            System.out.println("student grade b" + m);
        }else if(m>=80 && m<=85) {
            System.out.println("student grade a" + m);
        }else if(m>=85 && m<=100){
                System.out.println("student grade a+" + m);
        }else{
            System.out.println("student is failed" + m);
        }

    }
    public static void switchCase(String week){
        switch (week){
            case"sunday":
                System.out.println("today is sunday");
                break;
            case "monday":
                System.out.println("today is monday");
               break;
            case"tuesday":
                System.out.println("today is tuesday");
               // break;
            default:
                System.out.println("default is sunday");

        }
        System.out.println("outside switch");
    }


    public static void main(String[] args){
       // ifCondition(40);
      //  elseifCondition(40);
        switchCase("monday");

    }
}
