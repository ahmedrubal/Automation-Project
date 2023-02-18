package VariablePackage;

public class TypeConversion {
    public void dataTypeConversion(){
        //we can cast our datatype by using casting mechanism.
        // Here i casted String datatype  to Integer datatype.
        // String value must have to be int value("10").
        //when i am using + operator for int number it will add values
        String str = "10";
        int num = Integer.parseInt(str);
        System.out.println(num +10);
        System.out.println();
        // I am using casting here to changing datatype
        // Integer datatype to String datatype
        //when i am using + operator for string it is concatenating two values
        int number = 20;
        String string = String.valueOf(number);
        System.out.println(string+30);

    }
    public void casting(){
      //  While we are casting small numbers(like int) to bigeer numbers (like double) this is called automatic casting.
        // Here int datatype  (small numbers) to double datatype  (bigger numbers) .
        int small = 10;
        double bigger =  small;
        System.out.println(bigger);
        //While we are going bignumbers to small numbers this is called manually casting.
        // We have to provide datatype into parenthisis (int) for manuall casting.
        double bigN = 12.0;
        int smallNumber = (int) bigN;
        System.out.println(smallNumber);

    }


    public static void main(String[] args) {
        TypeConversion obj = new TypeConversion();
        obj.dataTypeConversion();
        obj.casting();
    }
}
