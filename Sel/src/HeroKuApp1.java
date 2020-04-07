import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroKuApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Learn\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://the-internet.herokuapp.com/";
        String expectedTitle = "The Internet";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        System.out.println("URL " + driver.getCurrentUrl());

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        driver.findElement(By.linkText("A/B Testing"));
        
        
        
        System.out.println("What" + driver.findElement(By.xpath("//a/img[@alt=Fork me on GitHub")).getLocation());
        
      
	}

}
