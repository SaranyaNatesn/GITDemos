package E2ESel.training;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class homePageTest extends base {
	
	WebDriver driver;
	homePage home;
	loginPage login;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@Test
	public void homeValidations() {
		
		driver=initializeDriver();
		
		try {
			
			System.out.println(getURL());
			driver.get(getURL());
			log.info("Page loaded");
			home=new homePage(driver);
			
			Assert.assertEquals(home.getTitle().getText(),"AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
	
	
}
