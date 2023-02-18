package Testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
    @Test(priority = 0)
    @Parameters({"UserName" ,"Password"})
    public void login(String UserName, String Password){

        System.out.println(UserName + " " +Password);
    }

    @Test(priority = 1)
    @Parameters({"UserName" ,"Password"})
    public void Balance(String UserName,String Password){
        System.out.println(UserName+ " " +Password);
          }
}
