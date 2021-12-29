package E2ESel.training;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginPageTest extends base{
	WebDriver driver; 
	loginPage login;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@Test(dataProvider = "getData")
	public void login(String username,String password) {
		driver=initializeDriver();
		try {
			driver.get(getURL());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login=new loginPage(driver);
		
		login.getLogin();
		log.info("Login Page loaded");
		login.getUserName().sendKeys(username);
		login.getPassWord().sendKeys(password);
		login.submitLogin().click();
		log.debug("Clicked on submit login");
	}
	@DataProvider
	public Object[][] getData(){
		
		Object[][] obj=new Object[1][2];
		obj[0][0]="test123@gmail.com";
		obj[0][1]="12345";
		
		return obj;
		
	}
}
