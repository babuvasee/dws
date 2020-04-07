package rediff.v1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RediffLogin {
	
AjaxElementLocatorFactory aelf;
WebDriver driver;
boolean errStatus = false;
String errMessage = "";

public RediffLogin(WebDriver driver) {
	this.driver = driver;
	//aelf = new AjaxElementLocatorFactory(driver, 10);
	//PageFactory.initElements(aelf, this);
}
/**

@FindBy(xpath = "//p[@id='signin_info']/a[@class='signin']")
WebElement loginLink;

@FindBy(xpath ="//input[contains(@id, 'login')]")
WebElement loginTB;

@FindBy(xpath ="//input[@id = 'password']")
WebElement passTB;

@FindBy(xpath ="//input[@name = 'proceed']")
WebElement submitIt;

@FindBy(xpath = "//span[@class = 'rd_from']")
WebElement mailLink;


@FindBy(xpath = "//a[@class = 'ng_mid_delete']")
WebElement delMail;
*/

public boolean login() {
	try {
		WebElement loginLink = driver.findElement(By.xpath("//p[@id='signin_info']/a[@class='signin']"));
		
		loginLink.click();
		
		WebElement loginTB = driver.findElement(By.xpath("//input[contains(@id, 'login')]"));
		WebElement passTB = driver.findElement(By.xpath("//input[@id = 'password']"));
		WebElement submitIt = driver.findElement(By.xpath("//input[@name = 'proceed']"));
				
		loginTB.sendKeys("pabu@rediffmail.com");
		passTB.sendKeys("Varan@123");
		submitIt.click();
		
		errStatus = true;
		} catch (Exception e) {
			errMessage = e.toString();
			errStatus = false;
		}
	return errStatus;

}


public boolean deleteEmail() {
	int i = 1, j = 1;
	
	if (login()) {
		WebElement mailLink = driver.findElement(By.xpath( "((//span[@class = 'rd_from']))["+i+"]"));
		WebElement delMail;
		System.out.println("Mail link Text = " + mailLink.getText());
			
		while(i<30){
			try {
			if(mailLink.getText().contains("Facebook") || mailLink.getText().contains("Amazon")) {
				mailLink.click();
				System.out.println("Found email = Clicked "  );
					
				delMail= driver.findElement(By.xpath("//a[@class = 'ng_mid_delete']"));
				System.out.println("Found email = Delete "  );
				
				delMail.submit();
				//delMail.click();
				System.out.println("Found email = Delete Clicked "  );
				
				System.out.println("Found email = " + i );
			}  
				i++;
				mailLink = driver.findElement(By.xpath( "(//span[@class = 'rd_from'])["+i+"]"));
				System.out.println("Mail link Text = " + i + " = " + mailLink.getText());
						
			//System.out.println("Mail link Text = " + mailLink.getText());
			
			errStatus = true;
			} catch (Exception e) {
				errMessage = e.toString();
				errStatus = false;
				System.out.println("Error " + errMessage);
			}
		}	
	}
	return errStatus;
}

}
