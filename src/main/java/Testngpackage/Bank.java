package Testngpackage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Bank {
    @Test
    public void login(){
        String id = "Rubal Ahmed";
        System.out.println(id);
    }

    @Test
    public void Balance(){
        int money = 1000;
        for (int i=1; i<=10; i++){
            System.out.println("print i value ::" +i);
        }
    }
//    @BeforeMethod
//    void chase(){
//        System.out.println(" @Before method must be login");
//    }
//    @AfterMethod
//    void receipt(){
//        System.out.println(" @ After method must be print receipt after balance transaction");
//    }
}
