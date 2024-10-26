package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseTestSetup.SetUpDriver;
import pageObjects.CreatAccountPage;
import pageObjects.HomePage_Magento;

public class TC_001_CreateAnAccount extends SetUpDriver
{
	@Test
	public void verify_CreatinAnAccount() 
	{
		try
		{
			HomePage_Magento hpm=new HomePage_Magento(driver);
			hpm.clickCreatAccount();
			
			CreatAccountPage ca = new CreatAccountPage(driver);
			ca.setFirstName(randomString().toUpperCase());
			ca.setLastName(randomString().toUpperCase());
			String email=randomString()+"@gmail.com";
			ca.setEmail(email);
			String pwds=randomAlphaNumeric();
			ca.setPassword(pwds);
			ca.setConfirmPassword(pwds);
			ca.clickCreateAccount();
			if(ca.isMyAccountExists()==true)
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
			
			
			
			
			
			
			
		}
		catch(Exception e)
		{
			Assert.fail();
			e.getMessage();
		}
		
	}
	

}
