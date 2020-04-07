import org.openqa.selenium.*;

public class Login {
	
	WebDriver driver;
	WebElement txtEmail, txtPassword;
	boolean testCheck = false;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	

	public boolean loginPage( ) {
	 try {	
		
		if (gotoLogin())
			if(getEmail("patanjalibabu@yahoo.com"))
				if (getPassword("Test@123"))
					submitPage();	  
     } catch (Exception e) {
    	 System.out.println(e.getMessage());
		  return testCheck;
	  }
	  
	  return testCheck;
    	
	}
	
	public boolean gotoLogin() {
		try {	
			
			driver.findElement(By.linkText("Log in")).click();
			System.out.println("Login Page - Complete");
			testCheck = true;
			return testCheck;
		} catch (Exception e) {
	    	 System.out.println(e.getMessage());
	    	 testCheck = false;
	    	 return testCheck;
		}
	  
	}

	
	
	public boolean getEmail(String strEmail) {
		try {	
			txtEmail = driver.findElement(By.xpath("//input[@id='Email']"));
			txtEmail.sendKeys(strEmail);
			System.out.println("Email - Complete");
			testCheck = true;
			return testCheck;
			} catch (Exception e) {
	    	 System.out.println(e.getMessage());
	    	 testCheck = false;	
	    	 return testCheck;
		}
	
	}
	

	
	public boolean getPassword(String strPass) {
		try {	
			txtPassword = driver.findElement(By.xpath("//input[@name='Password']"));
			txtPassword.sendKeys(strPass);
			System.out.println("Password - Complete");
			testCheck = true;
			return testCheck;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			testCheck = false;
			return testCheck;
		}
		
	}

	public boolean submitPage() {
		try {	
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				System.out.println("Login Button - Complete");
				testCheck = true;
				return true;		  
		} catch (Exception e) {
	    	 System.out.println(e.getMessage());
			testCheck = false;
			return false;
		}

	}
	
	
	public WebDriver getDriver() {
		return this.driver;
	}
}
