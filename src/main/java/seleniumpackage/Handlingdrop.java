package seleniumpackage;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import java.io.IOException;


public class Handlingdrop {
    public static void main(String[]args) throws IOException, InterruptedException {
        WebDriver driver;
        System .setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://book.spicejet.com/");
         System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
        WebElement roundTrip =driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']"));
        System.out.println(roundTrip.isSelected());
        roundTrip.click();
        System.out.println(roundTrip.isSelected());
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("marketDate_2")).getAttribute("style"));
        if(driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1")){
            System.out.println("it is enabled");
//            SoftAssert softAssert = new SoftAssert();
//            softAssert.assertTrue(true);
            Assert.assertTrue(true);
       }else {
            Assert.assertTrue(false);
        }
        WebElement clickOn= driver.findElement(By.id("divpaxinfo"));
        clickOn.click();
        WebElement adult = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Select select = new Select(adult);
        select.selectByIndex(5);
        WebElement currency =driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select select1 = new Select(currency);
        select1.selectByIndex(5);
        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.xpath("(//a[@value='BLR']) [2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr[4]/td[1]\n")).click();
        driver.findElement(By.id("custom_date_picker_id_2")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr[2]/td[3]")).click();
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
        Thread.sleep(2000);
//       // WebElement senior = driver.findElement(By.xpath("//div[@id='divdiscountcheckbox']/div[2]/input"));
//        senior.click();
//        System.out.println(senior.isSelected());
        driver.findElement(By.xpath("//input[@type='submit']")).click();


        driver.close();










       // SeleniumScreenShot.takesScreen(driver,"C:\\Users\\Rubal Ahmed\\Desktop\\screen shot picture\\");
      
    }
}
