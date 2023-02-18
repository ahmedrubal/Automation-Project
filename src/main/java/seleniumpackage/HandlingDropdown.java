package seleniumpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropdown {

 public   static   void ChromeBrowser () throws InterruptedException {
         WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

       // WebElement Month = driver.findElement(By.id("month"));
        //Select SelectMonth = new Select(Month); //Have to create select class for handling dropdown and need to pass webelent(month) inside the parameter
        //SelectMonth.selectByVisibleText("Dec");

       Thread.sleep(5000);


        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select SelectDay = new Select(day);// Have to create select class object for handling dropdown and pass webelement(day) inside parameter
        SelectDay.selectByValue("13");
        Thread.sleep(5000);


      WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
       Select SelectYear = new Select(year);//handling dropdown first have to create select class object and pass weblement(year) inside the parameter
       SelectYear.selectByValue("1998");
   //  System.out.println(SelectYear.getWrappedElement().getText());//only diffrence between getoptions method and getWrappedelement is return type ,
     //getoptions return type is list of webelement and  wrappedelement return type is just webelement.
   //  System.out.println(SelectYear.isMultiple()); // just to check is it selecting multiple value and returm type is boo;ean

//        List<WebElement> list = SelectDay.getOptions();//to get number of options available in a dropdownand return type is list of webelement
//        System.out.println("number of options::" + list.size());// get totall number of option use list.size
//        for (WebElement Day : list){
//            System.out.println("option is :"+ Day.getText());
     List<WebElement> list = SelectDay.getAllSelectedOptions();// it is use to getallselectedoptions.

     System.out.println(" number of getallselected options " + list.size());
     for (WebElement ele : list){
         System.out.println("option is available:"+ ele.getText());
     }
    // driver.close();

        }












public static void main (String[]args) throws InterruptedException {
    HandlingDropdown obj      =     new HandlingDropdown();
    obj.ChromeBrowser();}
}


