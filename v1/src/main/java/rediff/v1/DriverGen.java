package rediff.v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGen {
	
WebDriver driver;
	
	public DriverGen(){
	
	//TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Learn\\WebDriver\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
    String baseUrl = "http://www.rediff.com/";
    driver.get(baseUrl);
	}

	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
