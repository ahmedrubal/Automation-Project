package ExceptionPackage;

public class HandlingException {

        //This is the examaple of arithmatic exception
        public static void add(){
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();}


            int arr1[] = new int[4];
            try {

                arr1[0] = 10;
                arr1[1] = 20;
                arr1[2] = 30;
                arr1[3] = 40;
                arr1[4] = 50; // this line will throw an array index out of bound exception.
                //this is single catch with try
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                //This is double catch with try
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                // This is 3rd catch with try
            } catch (RuntimeException e) {
                e.printStackTrace();
                // This is parent class of exception class
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    public static void main(String[] args) {
        HandlingException.add();
        }

    }
