package E2ESel.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	WebDriver driver;
	
	private By title=By.xpath("//h3[text()='An Academy to learn Everything about Testing']");
	
	public homePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getTitle() {
		
		return driver.findElement(title);
	}
}

