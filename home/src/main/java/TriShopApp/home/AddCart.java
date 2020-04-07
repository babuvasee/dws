package TriShopApp.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AddCart {
	WebDriver driver;
	AjaxElementLocatorFactory aelf;
	boolean testCheck = false;
	String errMessage = "";
	
	public AddCart(WebDriver driver) {
		this.driver = driver;
		aelf = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(aelf, this);
	}
	
	@FindBy(linkText = "Books" )
	WebElement bookLink;
	
	@FindBy(xpath = "//input[@value='Add to cart']" )
	WebElement addBook;
	
	@FindBy(xpath = "//a[@href='/cart']/span[@class='cart-label']")
	WebElement cartLink;
	
	@FindBy(xpath = "//select[@id='CountryId']/option[@value='1']")
	WebElement selCountry;
	
	@FindBy(xpath = "//select[@id='StateProvinceId']/option[@value='58']")
	WebElement selState;
	
	@FindBy(xpath = "//input[@id='ZipPostalCode']")
	WebElement zipCode;
	
	@FindBy(xpath = "//input[@name='estimateshipping']")
	WebElement estShip;
	
	

	public boolean addCart( ) {
		if(gotoBooks()) {
			if(addBook()) {
				if(gotoCart()) {
					selCountry.click();
					selState.click();
					zipCode.sendKeys("23060");
					estShip.click();
					return true;
					
				}
			}
		}
		return false;
	}
		
	public boolean gotoBooks() {
		try {	
			
			bookLink.click();
			testCheck = true;
		} catch (Exception e) {
			 System.out.println(e.getMessage());
			 errMessage = errMessage.concat(e.toString());
			 testCheck =  false;
		}
	  
		return testCheck;	
	}
	
	public boolean addBook() {
		try {	
			addBook.click();
			testCheck = true;
		} catch (Exception e) {
			errMessage = errMessage.concat(e.toString());
			System.out.println(e.getMessage());
			 testCheck =  false;
		}
	  
		return testCheck;	
		
	}
	
	public boolean gotoCart() {
			try {	
			cartLink.click();
			testCheck = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			errMessage = errMessage.concat(e.toString()); 
			testCheck =  false;
		}
	  
		return testCheck;	
	
	}
	

	public WebDriver getDriver() {
		return this.driver;
	}


}
