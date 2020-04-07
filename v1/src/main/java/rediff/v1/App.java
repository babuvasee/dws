package rediff.v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
    	DriverGen dg = new DriverGen();
    	
    	RediffLogin rl = new RediffLogin(dg.getDriver());

    	System.out.println(rl.deleteEmail() + "Error " + rl.errMessage);
    	

    }
}
