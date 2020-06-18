package Basepack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseUtilities.baseutility;
import pageobjects.TestClass;

public class Testbase1 extends baseutility{
	public ExtentSparkReporter html ;
	public ExtentReports reports;
	public ExtentTest logger;
	
	String htmlpath = "C:\\Users\\hp\\eclipse-workspace\\pombasic\\Extentreport\\reports.html";
	String propfile = "C:\\Users\\hp\\eclipse-workspace\\pombasic\\src\\main\\resources\\properties\\system.properties";
	public static Properties prop;
	public FileInputStream fs;
	public static WebDriver driver;
	
	@BeforeSuite
	public void generalconfig() throws IOException
	{
		 prop = new Properties();
		 fs = new FileInputStream(propfile);
		 prop.load(fs);
		
	      html = new ExtentSparkReporter(htmlpath);
		 reports = new ExtentReports();
		reports.attachReporter(html);
		reports.setSystemInfo("operating system", "windows");
		reports.setSystemInfo("browser name", "chrome");
		html.config().setReportName("Unique testcase");
	}
	  @BeforeTest
	  public void logininto() throws InterruptedException 
	  {
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\SELENIUM AUTOMATION\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(prop.getProperty("url"));
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
	  @BeforeMethod
	  public void bmethod()
	  {
		  System.out.println("testcse is passed");
	  }
	  @AfterMethod
	  public void updatestatus(ITestResult results) throws IOException
	  {
		  if(results.getStatus()==ITestResult.SUCCESS)
		  {
			  logger.log(Status.PASS, MarkupHelper.createLabel("pass", ExtentColor.RED));
		  }
		  else if(results.getStatus()==ITestResult.FAILURE)
			 
		  {
			logger.log(Status.FAIL,"failed");  
			 TestClass.screenshot();
		  }
		  else  if(results.getStatus()==ITestResult.SKIP)
		  {
			logger.log(Status.SKIP, "skipped");
		  }
		  else
		  {
			  System.out.println("status not found");
		  }
	  }
	  
	   
	  @AfterTest
	  public void close()
	  {
		  reports.flush();
		  driver.quit();
}

}
