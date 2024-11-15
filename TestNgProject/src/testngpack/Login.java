package testngpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login {
	
	WebDriver wd = new ChromeDriver();
	
  @Test
  @Parameters({"un","pw"})
  public void f(String un, String pw) {
	  
	  wd.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
	  wd.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
	  wd.findElement(By.id("submit")).click();
	  wd.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  wd.get("https://practicetestautomation.com/practice-test-login");
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(5000);
	  wd.close();
  }

}
