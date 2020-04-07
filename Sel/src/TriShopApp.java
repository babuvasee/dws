import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TriShopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Learn\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        String baseUrl = "http://demowebshop.tricentis.com/";
      //  String expectedTitle = "Demo Web Shop";
        //String actualTitle = "";

        driver.get(baseUrl);
        boolean  result = false;
        
        Register reg = new Register(driver);
        reg.RegisterPage();
        
        
     // Invoke Login Page
        
        Login log = new Login(driver);
        result = log.loginPage();
         
    	if (result) {
    		System.out.println("Login Passed");
    		driver = log.getDriver();
    	} else {
    			System.out.println("Login Failed");
    	}		
     
    	// Add Cart Page
        AddCart AC = new AddCart(driver);
       
        if(result)
        	result = AC.addCart();
    	
    	if (result)
    		System.out.println("Cart Add - Passed");
    	else
    		System.out.println("Cart Add - Failed");
        	
  
      
	}

	
	public void oldMethod() {
	    /**
	     * 
	     * // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        System.out.println("URL " + driver.getCurrentUrl());

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Title Check - Complete");
        } else {
            System.out.println("Title Check - Failed");
        }
        
    	driver.findElement(By.linkText("Log in")).click();
  
    // Pass the login credential 
    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("patanjalibabu@yahoo.com");
    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Test@123");
    driver.findElement(By.xpath("//input[@value='Log in']")).click();;
     
    //In the next screen  
    driver.findElement(By.xpath("//a[@href='/books']")).click();
    
    driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
    driver.findElement(By.xpath("(//a[@href='/cart'])[1]")).click();
  //input[@value='Add to cart']
   
    */
	}
}
