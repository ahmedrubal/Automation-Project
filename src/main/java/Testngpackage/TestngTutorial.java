package Testngpackage;


import org.testng.annotations.*;

public class TestngTutorial {
    @Test
    public void one(){
        System.out.println("Hello World");
    }
    @Test
    public void two(){
        System. out.println("bye");
    }
    @BeforeMethod
    public void three(){
        System.out.println(" i am@ before method");
    }
    @AfterMethod
    public void four(){
        System.out.println("i am@ after method");
    }
    @BeforeClass
    public void five(){
        System.out.println("i am@Before class annotated method");
    }
    @AfterClass
    public void six(){
        System.out.println("i m@After class annotated method");
    }
    @BeforeTest
    public void seven(){
        System.out.println("i am@Before test annotated method");
    }
    @AfterTest
    public void eight(){
        System.out.println("i am@ after test annotated method");

    }
    @BeforeSuite
    public void Beforesuite(){
        System.out.println("i am @ before suite annotated method");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("i am @ after suite annotated method");
    }
}
