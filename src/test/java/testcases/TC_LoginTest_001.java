package testcases;

import org.testng.annotations.Test;

import pageobject.Loginpage;

public class TC_LoginTest_001 extends Baseclass {
	
	@Test
	
	public void logintest(String user, String pword) throws InterruptedException {
		
	
		Loginpage lp=new Loginpage(driver);
		
		lp.setUsername();
		Thread.sleep(2000);
		lp.setPassword();
		Thread.sleep(2000);
		lp.ClickLoginbtn();
		
	}	

}
