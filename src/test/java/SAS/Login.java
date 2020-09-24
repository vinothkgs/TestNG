package SAS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Pojo.LoginPojo;


public class Login extends Base {

	@BeforeTest
	@Parameters({"browser"})
	public void tc1(String s1) {
		if(s1.equals("firefox")) {
			getDriverAcces();
			
		}
			else if(s1.equals("chrome")) {
				
				getDriverAccesFireFox();
			}
		
		}
	
	
	@BeforeClass
	public void tc2() throws AWTException, InterruptedException {
		driver.get("https://www.flysas.com/en/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPojo l= new LoginPojo();
		click(l.getClose());
		/*Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);	*/	
		
	}
	
	@Test (dataProvider="dprovider")
	public void tc3(String a, String b) throws InterruptedException, IOException {
		
		LoginPojo l= new LoginPojo();
		click(l.getLogin());

		fill(l.getUsr(), a);
		fill(l.getPass(), b);
		click(l.getLogbut());
		
		WebElement error = driver.findElement(By.xpath("//p[@id='cerm']"));
		String text = error.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Sorry, we couldn't find you with this login ID and password combination. Please try again.");
		click(l.getLogin());
	
	}
	
	@Test
	public void tc4() {
		LoginPojo l= new LoginPojo();
		Assert.assertEquals(getText(l.getStravel()),"SAS SAFE TRAVEL");
	}
	
	@Test
	public void tc5() {
		LoginPojo l= new LoginPojo();
		click(l.getSoi());
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.flysas.com/en/safe-travel/");
	}

	@Test
	public void tc6() {
		LoginPojo l= new LoginPojo();
		mouseover(l.getBook());
		click(l.getCalander());
		Assert.assertEquals(driver.getTitle(), "Low fare calendar – find our cheapest fares | SAS");
		System.out.println("Low fare calendar – find our cheapest fares | SAS\t Navigated");
		mouseover(l.getBook());
		click(l.getYouthTickets());
		Assert.assertEquals(driver.getTitle(), "SAS Youth - Tickets for you who are under 26 | SAS");
		System.out.println("SAS Youth - Tickets for you who are under 26 | SAS\t navigated");
		mouseover(l.getBook());
		click(l.getuMiror());
		Assert.assertEquals(driver.getTitle(), "Unaccompanied Minor service – For children age 5–17 | SAS");
	}
	
	@DataProvider(name="dprovider")
	public Object[][]getDataprovider() throws IOException{
		return new Object[][]
				{
			{dataDriven(0, 0),dataDriven(0, 1)},
			{dataDriven(1, 0),dataDriven(1, 1)},
			{dataDriven(2, 0),dataDriven(2, 1)}
			
	};
	}
}
