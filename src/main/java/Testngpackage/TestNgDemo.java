package Testngpackage;

import org.testng.annotations.*;

public class TestNgDemo {
    @Test
    public void m1() {
        System.out.println("im method m1");
    }

    public void m2() {
        System.out.println("im method m2");
    }
    @BeforeMethod
    public  void login(){
        System.out.println("i am @beforemethod login annotated method");
    }
    @AfterMethod
    public void logout(){
        System.out.println("i am @ after method logout annotated method");
    }
    @BeforeTest
    public void account(){
        System.out.println();
    }
    @AfterTest
    public void balance(){
        System.out.println("i am @after test method");
    }


}