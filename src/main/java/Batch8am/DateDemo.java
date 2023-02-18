package Batch8am;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
    //This is the demo method to get the current date and time to print in the console
    // First of all we have to create an object of date class which is present on the java.util package and it will give by java format
    // If we want to cutomize to our format then we have to use SimpleDateFormat class and create an object and pass that
    //...format that we would like
    public void date() {

        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
        System.out.println(sdf.format(d));

    }

    public static void main(String[] args) {
        DateDemo dm = new DateDemo();
        dm.date();
    }
}
