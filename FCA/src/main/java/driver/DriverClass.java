package driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverClass{
                WebDriver driver;
                
                public DriverClass(String baseUrl) {
                    // declaration and instantiation of objects/variables
                	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
                    //WebDriver driver = new FirefoxDriver();
                    //comment the above 2 lines and uncomment below 2 lines to use Chrome
                    System.setProperty("webdriver.chrome.driver","C:\\Learn\\WebDriver\\chromedriver_win32\\chromedriver.exe");
                                
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("useAutomationExtension", false);
                    driver = new ChromeDriver(options);
                    driver.get(baseUrl);
                }
                
                
                public WebDriver getDriver() {
                                return this.driver;
                }
                
                public void setDriver(WebDriver driver) {
                                this.driver = driver;
                }
    
}



