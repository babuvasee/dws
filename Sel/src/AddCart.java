import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCart {
	
	WebDriver driver;
	WebElement bookLink, addBook, cartLink;
	boolean testCheck = false;
	
	public AddCart(WebDriver driver) {
		this.driver = driver;
	}

	
	public boolean addCart() {
		try {	
			if (gotoBooks())
				if (addBook())
					gotoCart();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return testCheck;
		}
		  
		return testCheck;
	}
	
	
	public boolean gotoBooks() {
		try {	
			bookLink = driver.findElement(By.xpath("//a[@href='/books']"));
			bookLink.click();
			System.out.println("Book Page - Complete");
			testCheck = true;
		} catch (Exception e) {
			 System.out.println(e.getMessage());
			 return false;
		}
	  
		return true;	
	}
	
	public boolean addBook() {
		try {	
			addBook = driver.findElement(By.xpath("//input[@value='Add to cart']"));
			addBook.click();
			System.out.println("Add Book - Complete");
			testCheck = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	  
		return true;
		
	}
	
	public boolean gotoCart() {
			try {	
			cartLink = driver.findElement(By.xpath("//a[@href='/cart']/span[@class='cart-label']"));
			cartLink.click();
			System.out.println("Cart - Complete");
			testCheck = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	  
		return true;	
	
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
}
