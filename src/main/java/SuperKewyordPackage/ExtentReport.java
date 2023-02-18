package SuperKewyordPackage;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
   // Extent Report followed by Rahul Shetty
public class ExtentReport {
    String path = System.getProperty("user.dir")+"\\reports\\index.html";
    ExtentReports extent;
    @BeforeTest
    public void getReport(){
        // Here i am creating the object of ExtentSparkReporter class and providing the file path
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Application Test");//this line to give report name
        reporter.config().setDocumentTitle("Automation Result"); // this line to give title of the report
       extent = new ExtentReports(); // this line to create the object of ExtentReports class
       extent.attachReporter(reporter);
       extent.setSystemInfo("TESTER","Rubal Ahmed");// this line to provide name of tester
    }
    @Test
    public void testMethod(){
        extent.createTest("testMethod"); // this line just to provide which method we want to get report
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","drivers/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        extent.flush(); // flushing the report


    }
}
