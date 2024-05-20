package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myHomepage {
	WebDriver dr;
	public myHomepage(WebDriver driver)
	{
		this.dr=driver;
	}
	
	
	
	By loginLink= By.xpath("//span[@class='icon icon-xs mdi-chart-bar']");
	public void gotologinpage()
	{
		dr.get("https://freecrm.com/");
		dr.findElement(loginLink).click();
		}
	

}
