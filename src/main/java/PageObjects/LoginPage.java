package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver dr;
	public LoginPage(WebDriver driver)
	{
		this.dr=driver;
	}
	
	
	
	By email= By.xpath("//input[@name='email']");
	By pw= By.xpath("//input[@name='password']");
	By signInButton= By.xpath("//div[@class='ui fluid large blue submit button']");
	public void fillLoginDetails() throws InterruptedException
	{
		
		
		dr.findElement((email)).sendKeys("a@b.com");
		dr.findElement(pw).sendKeys("test@123");
		dr.findElement(signInButton).click();
	       Thread.sleep(2000);
	String ac=dr.findElement(By.xpath("//div[@class='header']")).getText();
		System.out.println(ac);
		}
}
