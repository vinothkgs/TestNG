package Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SAS.Base;

public class Login extends Base {
	public Login() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="cutomer-not-logged")
	private WebElement login;
	
	@FindBy(id="Loginemail")
	private WebElement user;
	
	@FindBy(id="Loginpassword")
	private WebElement pass;
	@FindBy(id="login")
	private WebElement logbutton;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogbutton() {
		return logbutton;
	}
	
	

}
