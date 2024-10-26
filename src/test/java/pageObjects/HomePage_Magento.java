package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_Magento extends BasePageHC{

	public HomePage_Magento(WebDriver driver) 
	{
		super(driver);
	}
	

	@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']") WebElement createAnAccount;
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]") WebElement signIn;
	
	public void clickCreatAccount() 
	{
		createAnAccount.click();
	}
	
	public void clickSign_In() 
	{
		signIn.click();
	}
	

}
