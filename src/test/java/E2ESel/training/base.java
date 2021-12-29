package E2ESel.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	WebDriver driver;
	Properties prop;

	public WebDriver initializeDriver() {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public String getURL() throws IOException, FileNotFoundException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		return prop.getProperty("url");
	}
	
	public void getScreenshotPath(String filename,WebDriver driver) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFileName=System.getProperty("user.dir")+"\\reports\\"+filename+".png";
		System.out.println("destinationFileName"+destinationFileName);
	FileUtils.copyFile(source, new File(destinationFileName));
	
	}
}
