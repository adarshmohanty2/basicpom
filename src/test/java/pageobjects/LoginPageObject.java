package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	public LoginPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/img")
	WebElement loginlogo;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div/div/div/div[1]/small")
	WebElement  loginwelcome;
	
	@FindBy(name="email")
	WebElement uEmail;
	
	@FindBy(name="password")
	WebElement uPass;
	
	@FindBy(xpath="//*[@id=\"login\"]/div[3]/div[2]/button/span")
	WebElement login;
	
	@FindBy(name="remember")
	WebElement remebox;
	
	@FindBy(linkText="I forgot my password")
	WebElement forgetpass;
	
	@FindBy(linkText="Free Accounting Software")
	WebElement creditlink;
	
	
	public void loginlogo()
	{
		
	}
	public void loginwelcome()
	{
		
	}
	public void loginEmail(String email) 
	{
		uEmail.sendKeys(email);	
	}
	public void loginPass(String pass)
	{
		uPass.sendKeys(pass);
	}
	public void buttonclick()
	{
		login.click();
	}
	public void remebox()
	{
		
	}
	public void forgetpass()
	{
		
	}
	public void creditlink()
	{
		
	}

}
