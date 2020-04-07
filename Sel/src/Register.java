import org.openqa.selenium.*;

public class Register {
	
	WebDriver driver;
	WebElement radioGender, txtEmail, txtPassword;
	boolean testCheck = false;
	
	
	public Register(WebDriver driver) {
		this.driver = driver;
	}
	

	public boolean RegisterPage( ) {
	 try {	
		
		if (gotoRegister())
			if (getFName("Babu"))
				if (getLName("Vasee"))
					if(getEmail("patanjalibabu@yahoo.com"))
						if (getPassword("Password", "Test@123"))
							if (getPassword("ConfirmPassword", "Test@123"))
								registerMe();	  
     } catch (Exception e) {
    	 System.out.println(e.getMessage());
		  return testCheck;
	  }
	  
	  return testCheck;
    	
	}
	
	public boolean gotoRegister() {
		try {	
			
			driver.findElement(By.linkText("Register")).click();
			System.out.println("Register Page - Complete");
			testCheck = true;
			return testCheck;
		} catch (Exception e) {
	    	 System.out.println(e.getMessage());
	    	 testCheck = false;
	    	 return testCheck;
		}
	  
	}

	

	public boolean getGender(String strGender) {
		try {	
			if (strGender.equals("Male"))
				radioGender = driver.findElement(By.xpath("//div[@class='gender']/input[@value='M']"));
			else 
				radioGender = driver.findElement(By.xpath("//div[@class='gender']/input[@value='F']"));
			System.out.println("Email - Complete");
			testCheck = true;
			return testCheck;
			} catch (Exception e) {
	    	 System.out.println(e.getMessage());
	    	 testCheck = false;	
	    	 return testCheck;
		}
	
	}

	public boolean getFName(String strFName) {
		try {	
			txtEmail = driver.findElement(By.xpath("//input[@id='FirstName']"));
			txtEmail.sendKeys(strFName);
			System.out.println("First Name - Complete");
			testCheck = true;
			return testCheck;
			} catch (Exception e) {
	    	 System.out.println(e.getMessage());
	    	 testCheck = false;	
	    	 return testCheck;
		}
	
	}
	
	public boolean getLName(String strLName) {
		try {	
			txtEmail = driver.findElement(By.xpath("//input[@id='LastName']"));
			txtEmail.sendKeys(strLName);
			System.out.println("Last Name - Complete");
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
	

	
	public boolean getPassword(String xID, String strPass) {
		try {	
			txtPassword = driver.findElement(By.xpath("//input[@name='" + xID + "']"));
			txtPassword.sendKeys(strPass);
			System.out.println(xID + " - Complete");
			testCheck = true;
			return testCheck;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			testCheck = false;
			return testCheck;
		}
		
	}

	public boolean registerMe() {
		try {	
				driver.findElement(By.xpath("//input[@value='Register']")).click();
				System.out.println("Register - Complete");
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
