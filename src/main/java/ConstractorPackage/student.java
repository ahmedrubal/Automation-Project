package ConstractorPackage;

      //class name and constractor (method) name must be same name  in a constractor
      // two types of constractor available in java 1. default 2.parametarize
public class student {

    String name;
    int number;
    int count;

    // For constractor no method return type but regular method must have any return type
    //This is default constractor . we can not create multiple default constractor in a..
    //single class.//purpose of default constractor is initialize a default value for instance variables.

     student(){
         System.out.println("i am default constractor");

    }      //This is parametarize constractor and its must have parametar in constractor declaration
    // we define instance variable value = local variable(name1,number1)
    //we can create multiple parametarize constrator in a single class but number..
    //of parametar should be diffrent.

    student(String name1,int number1){
         this.name=name1;
         this.number= number1;

    }
    student(String name1,int number1,int count1){
         this.name = name1;
         this.number = number1;
         this.count = count1;
    }  //we create display method just to see output in the console
    void display(){
        System.out.println(name+" "+number+" "+count );
    }


// Every time we are giving diffrent value for parametarize variables,we have to create object.
//for default constractor we dont need to call by object just create object for a class
//default value 0 printing bcz i didnt assign any value for(obj1) instance variable count.
    public static void main(String[] args) {

        student obj = new student();

        student obj1 = new student("rubal",10);
        obj1.display();
        student obj2 = new student("rubal",20,30);
        obj2.display();



    }
}
