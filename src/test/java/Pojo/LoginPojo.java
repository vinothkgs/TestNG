package Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SAS.Base;

public class LoginPojo extends Base {
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
		
	@FindBy (id="cutomer-not-logged")
	private WebElement login;
	
	@FindBy (id="Loginemail")
	private WebElement usr;
	
	@FindBy (id="Loginpassword")
	private WebElement pass;
	
	@FindBy (id="login")
	private WebElement logbut;
	
	@FindBy (id="//a[@class='icon-logo']")
	private WebElement logo;
	
	@FindBy(xpath="//h2[@class='bg-deep-blue text-white']")
	private WebElement stravel;
	
	@FindBy(xpath="//a[@title='See our initiatives']")
	private WebElement soi;
	
	@FindBy(xpath="//a[@aria-label='Book']")
	private WebElement book;
	
	
	@FindBy(xpath="(//a[@aria-label='Low fare calendar'])[2]")
	private WebElement calander;
	
	@FindBy(xpath="(//a[@aria-label='SAS Youth tickets'])[2]")
	private WebElement youthTickets;
	
	
	@FindBy(xpath="(//a[@aria-label='Unaccompanied Minors'])[2]")
	private WebElement uMiror;
	
	@FindBy(xpath="//span[@class='icon-close-black']")
	private WebElement close;
	
	
	

	public WebElement getClose() {
		return close;
	}



	public WebElement getuMiror() {
		return uMiror;
	}



	public WebElement getYouthTickets() {
		return youthTickets;
	}



	public WebElement getCalander() {
		return calander;
	}



	public WebElement getBook() {
		return book;
	}



	public WebElement getSoi() {
		return soi;
	}



	public WebElement getStravel() {
		return stravel;
	}



	public WebElement getLogo() {
		return logo;
	}



	public WebElement getUsr() {
		return usr;
	}



	public WebElement getPass() {
		return pass;
	}



	public WebElement getLogbut() {
		return logbut;
	}



	public WebElement getLogin() {
		return login;
	}
	
	
	
		}
		
		
		


