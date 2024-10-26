package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTestSetup.SetUpDriver;
import pageObjects.CreatAccountPage;
import pageObjects.HomePage_Magento;
import pageObjects.SignIn_Page;
import pageObjects.myAccountPage;

public class TC002_SignIn_To_Account extends SetUpDriver
{
	@Test
	public void verifyLogin() 
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
			
			myAccountPage mp=new myAccountPage(driver);
			mp.ClickMenu();
			mp.clickSignOut();
			
			hpm.clickSign_In();
			
			SignIn_Page sp=new SignIn_Page(driver);
			sp.SetEmail(email);
			sp.SetPassword(pwds);
			sp.clickSignIn();
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
