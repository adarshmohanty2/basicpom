package pageobjects;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;

import Basepack.Testbase1;
import pageobjects.LoginPageObject;

public class TestClass extends Testbase1
{
	
	private  LoginPageObject obj;
	
	
@BeforeClass
public void objectsetup()
{
	 obj = new LoginPageObject(driver);
	
}
	  @Test(priority=0)
	  public void gettitle()
	  { 
		 logger = reports.createTest("verify the testcase");
		 String exptitle = "Login";
		 String acttitle = driver.getTitle();
		 System.out.println(acttitle);
	  }
	  @Test(priority=1)
	  public void login()
	  {
		  logger = reports.createTest("verify the email");
		  obj.loginEmail("noahglobal89@gmail.com");
	  }
	  @Test(priority=2)
	  public void pass()
	  {
		  logger = reports.createTest("verify the password");
		  obj.loginPass("admin123");
	  }
	  @Test(priority=3)
	  public void click() throws InterruptedException
	  {
		  logger = reports.createTest("verify the clickbtn");
		  obj.buttonclick();
		  Thread.sleep(3000);
	  }
	 @Test
	 public static void screenshot() throws IOException
	 {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File(prop.getProperty("screenshot")+"\\simple.png");
		 FileHandler.copy(src, dest);
	 }
		  
	  }
	  
	  
	  
