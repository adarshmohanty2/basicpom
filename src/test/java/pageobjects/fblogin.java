package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fblogin {
	WebDriver driver;
	  @BeforeTest
	  public void login() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\SELENIUM AUTOMATION\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
	  @Test
	  public void title()
	  {
		 System.out.println(driver.getTitle());
	  }
	  @AfterClass
	  public void close()
	  {
		  driver.quit();
	  }
}
