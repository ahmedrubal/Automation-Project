package Testngpackage;

import SuperKewyordPackage.ExtentReport;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Two types of assert available in java 1 .Hard Assert 2. Soft Assert
 @Test
 public class AssertionClass {


    //This is hard assert so whenever it is not matching with provided condition it will block rest
    // .. of the code for execution .
    public void test1(){

        int num = 20;
        int num1 = 23;
        Assert.assertEquals("num1","num1","condition  match");
        System.out.println("assert applied");
    }
    // This is soft assert whenever it is not matching with provided condition it will  not block rest
    // of our code .
    // After using softAssert.assertAll(); end of my code then it will show us assert message why assert method failed.
    //When i will run test2 method it will print out line number 28 but ultimetly my test2 method is failed .
     @Test
    public void test2(){

        int num = 10;
        int num1 = 20;
        SoftAssert softAssert =  new SoftAssert();
        softAssert.assertTrue(false);
        System.out.println("assert applied");
        softAssert.assertAll();
    }

}
