package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatAccountPage extends BasePageHC
{

	public CreatAccountPage(WebDriver driver) 
	{
		super(driver);
	}
	

	@FindBy(xpath="//input[@id='firstname']") WebElement firstName;
	@FindBy(xpath="//input[@id='lastname']") WebElement lastName;
	@FindBy(xpath="//input[@id='email_address']") WebElement email;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//input[@id='password-confirmation']") WebElement confirmPassword;
	@FindBy(xpath="//button[@title='Create an Account']//span[contains(text(),'Create an Account')]") WebElement createAccount;
	//@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']") WebElement confirmMsg;
	@FindBy(xpath="//span[@class='base']") WebElement myAccount;
	
	
	public void setFirstName(String fname) 
	{
		firstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) 
	{
		lastName.sendKeys(lname);	
	}
	
	public void setEmail(String emailadd) 
	{
		email.sendKeys(emailadd);	
	}
	
	public void setPassword(String pwd) 
	{
		password.sendKeys(pwd);	
	}
	public void setConfirmPassword(String pwd) 
	{
		confirmPassword.sendKeys(pwd);	
	}
	
	public void clickCreateAccount() 
	{
		createAccount.click();
	}
	
	public boolean isMyAccountExists() 
	{
		boolean status=myAccount.isDisplayed();
		if(status==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
