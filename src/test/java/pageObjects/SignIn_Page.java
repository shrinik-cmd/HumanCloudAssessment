package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn_Page extends BasePageHC
{

	public SignIn_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='email']") WebElement txt_email;
	@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']") WebElement txt_password;
	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]") WebElement signIn;
	

	public void SetEmail(String email) 
	{
		txt_email.sendKeys(email);
	}
	
	public void SetPassword(String si_password) 
	{
		txt_password.sendKeys(si_password);
	}
	
	public void clickSignIn() 
	{
		signIn.click();
	}
	
}
