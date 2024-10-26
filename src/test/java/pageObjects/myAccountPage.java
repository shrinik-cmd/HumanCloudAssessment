package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends BasePageHC
{

	public myAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//@FindBy(xpath="(//div[@class=\"customer-menu\"])[1]") WebElement change;
	//@FindBy(xpath="//div[@class='header content']") WebElement toggleNav;
	@FindBy(xpath="//div[@class='panel header']//button[@type='button']") WebElement change;
	@FindBy(xpath="//div[@aria-hidden='false']//a[normalize-space()='Sign Out']") WebElement signOut;
	//@FindBy(xpath="(//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/'])[1]") WebElement signOut;
	
	public void ClickMenu() 
	{
		change.click();
		
	}
	
	public void clickSignOut() 
	{
		signOut.click();	
	}
}
