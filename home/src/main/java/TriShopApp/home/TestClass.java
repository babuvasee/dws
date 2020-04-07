package TriShopApp.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Test Main Class
 *
 */
public class TestClass 
{
	WebDriver driver;
	

  
  public TestClass() {
	  	// Initiating the Driver
	  	System.setProperty("webdriver.chrome.driver","C:\\Learn\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// Web Page to Be Loaded
		 String baseUrl = "http://demowebshop.tricentis.com/";
		 //  String expectedTitle = "Demo Web Shop";
		 //String actualTitle = "";
		 driver.get(baseUrl);
  }
  
  
  public void testMe() {
	
	  Register reg = new Register(driver);
	  
	  String strArr[] = {"Male", "One", "Two", "wlpvs1@gmail.com", "Wlp@23060"};
	  if (reg.regMe(strArr)) {
		  if(reg.getStatus().equals("Registered")){
		  System.out.println(reg.getStatus());
		  } else if (reg.getStatus().equals("Already Registered")){
			  System.out.println(reg.getStatus());
		  } else {
			  System.out.println(reg.getStatus());
		  }
	  }
	  driver = reg.getDriver();
	  
	  Login log = new Login(driver);
	  log.loginPage();	
	  driver = reg.getDriver();
	  AddCart ac = new AddCart(driver);
	  ac.addCart();
	  
	  	
  	  } 
  
 
}
