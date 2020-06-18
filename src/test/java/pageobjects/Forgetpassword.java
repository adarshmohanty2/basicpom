package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgetpassword {
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/img")
	WebElement logo;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[1]/small")
	WebElement text;
	
	@FindBy(name="email")
	WebElement mail;
	
	@FindBy(xpath="//*[@id=\"forgot\"]/div[2]/div/button/span")
	WebElement button;
	
	@FindBy(linkText="Free Accounting Software")
	WebElement link;
	
	
	public void logo()
	{
		
	}
	public void text()
	{
		
	}
	public void mail()
	{
		
	}
	public void button()
	{
		
	}
	public void link()
	{
		
	}

}
