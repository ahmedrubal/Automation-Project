package Testngpackage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class priorityAndDepend {
    //when there is no priority keyword execution order happened by alphabetic order
    //Method execute by priority numbering order.
    // we are able to skip method by adding enabled = false
    // if previous method passed then execute next by using (dependsOnMethod)
    //groups use for making droups (multiple groups use {} brace)

    @Parameters({"un","pw"})
    @Test(priority=1)
    public void login(@Optional String username,@Optional String password){
        System.out.println("i am login ");
    }
    @Test(priority = 2,groups = "A")

    public void inbox(){
        System.out.println("i am inbox");

    }
    @Test(priority = 3,dependsOnGroups = {"A"})
    public void sent(){
        System.out.println(" i am sent");
    }
    @Test(priority = 4)
    public void logout(){
        System.out.println(" i am logout");
    }
}
