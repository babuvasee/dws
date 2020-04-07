package stepdefn;

import driver.DriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LoginMain{
                
                DriverClass dc = new DriverClass("https://www.freecrm.com/");
                WebDriver wd = dc.getDriver();
                AjaxElementLocatorFactory aelf;
                
                public LoginMain() {
					aelf = new AjaxElementLocatorFactory(wd, 10);
					PageFactory.initElements(aelf, this);					
				}
                
                @FindBy(xpath = "//a[@href='https://ui.freecrm.com']")
                WebElement loginLink;
                
                @FindBy(xpath ="//input[@name='email']")
                WebElement emailTxt;
                
                @FindBy(xpath ="//input[@name='password']")
                WebElement passTxt;
                
                @FindBy(xpath ="//div[contains(@class, 'ui fluid')]")
                WebElement loginButton;
                
                @Given("^Navigate to CRM Page$")
                public void login_to_CRM() throws Throwable {
                    System.out.println("Test 0");
                    loginLink.click();
                    System.out.println(wd);
                    
                 
                }
                
                
                @Then("^.*user credential$")
                public void enter_the_user_credential() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                	   if(wd.getTitle().contains("Cogmento CRM")) 
                           System.out.println("Title Passed");
                      else
                           System.out.println("Title Failed");

                      System.out.println("Test 2");
                      emailTxt.sendKeys("patglenallen@gmail.com");
                      passTxt.sendKeys("Test@123");
                }

                @Then("^(?:click|press) the (?:submit|Submit) button$")
                public void click_the_submit_button() throws Throwable {
                    // Write code here that turns the phrase above into concrete actions
                    System.out.println("Test 3");
                    loginButton.click();

                    if(wd.getTitle().contains("Cogmento CRM")) 
                        System.out.println("Main - Title Passed");
                    else
                        System.out.println("Main - Title Failed");
                }

}
