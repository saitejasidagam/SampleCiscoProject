package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
	  @Test
	  public void openMyFBPage() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.ie.driver", "F:\\Saradhi.Seshagiri\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
		  
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
