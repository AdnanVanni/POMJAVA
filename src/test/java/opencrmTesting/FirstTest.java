package opencrmTesting;
import java.io.Console;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.myHomepage;

public class FirstTest {

	
	public static ChromeDriver cd;
	@BeforeSuite
	public  void  b4()
	{
		System.out.print("test started before test method");
	}
	
	@BeforeTest
	public  void  setup()
	{
		cd= new ChromeDriver();
	}
	@Test
	public void TestLogin() throws InterruptedException
	{
		myHomepage mh= new myHomepage(cd);
	mh.gotologinpage();
	
	//WebElement iframe = cd.findElement(By.cssSelector("#modal>iframe"));

	//Switch to the frame
	//cd.switchTo().frame(iframe);
	LoginPage login= new LoginPage(cd);
	login.fillLoginDetails();
	

	}
	@AfterTest
	public void closebrowser()
	{
		cd.close();
	}
	
	@AfterSuite
	public  void  After()
	{
		System.out.print("test end after test method");
	}
	
	
}
