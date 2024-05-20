package Tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SampleTest {


 
 public static ChromeDriver cd=null;
  @BeforeTest
  public void setUp() throws Exception {
   // WebDriverManager.chromedriver().setup();
  
	  
	 cd = new ChromeDriver();
  } 
  
  @Test
  public void firstTestCase() {
    
      System.out.println("Launch Gmail");
      cd.get("https://www.gmail.com/");
      Assert.assertEquals("Gmail", cd.getTitle());
      Assert.assertEquals("Gmail",cd.getTitle());
    
}
  

  @AfterTest
  public void closeBrowser() {
    cd.close();
    System.out.println("The driver has been closed.");
  }
}

