package E2ESel.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}

	private By login =By.cssSelector("a[href*='sign_in']");
	private By userName = By.id("user_email");
	private By password = By.xpath("//input[@type='password']");
	private By submitLogin = By.cssSelector("input.login-button");
	public void getLogin() {
		driver.findElement(login).click();

	}
	public WebElement getUserName() {
		return driver.findElement(userName);

	}
	public WebElement getPassWord() {
		return driver.findElement(password);

	}
	public WebElement submitLogin() {
		return driver.findElement(submitLogin);

	}
	
}
