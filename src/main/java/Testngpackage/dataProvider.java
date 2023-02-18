package Testngpackage;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {


    @DataProvider(name = "LoginData")
    public Object[][] TestData(){
        return new Object[][]{
                {"demo1","demo1"},
                {"demo2","demo2"},
                {"demo3","demo3"},
                {"demo4","demo4"},
        };
    }
    @Test(dataProvider ="LoginData" )
    public void loginTest(String str1,String str2){
        Reporter.log(str1+""+str2,true);

    }

}
