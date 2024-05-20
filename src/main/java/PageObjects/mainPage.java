package PageObjects;
import static org.testng.Assert.assertEquals;

import java.io.Console;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPage {
	
	WebDriver dr;
	public mainPage(WebDriver driver)
	{
		this.dr=driver;
	}
	public void assertandPrintvalue()
	{
	String ac=dr.findElement(By.xpath("//div[@class='header']")).getText();
	assertEquals(ac,"Something went wrong...");
	}
}

