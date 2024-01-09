package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//create constructor
	
	public static WebDriver driver;
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	//create corresponding methods
	
	public void setUsername() {
		txtusername.sendKeys("mahesh@23456");
	}
	
	public void setPassword() {
		txtpassword.sendKeys("India@123");
	}
	
	public void ClickLoginbtn() {
		btnLogin.click();
	}

}
