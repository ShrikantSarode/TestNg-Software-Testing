package testngpack;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class MultipleTestCases {
  @Test (priority = 1)
  public void login() {
	  System.out.println("login test case");
  }
  
  @Test(priority = 2)
  public void home() {
	  System.out.println("home test case");
  }
  
  @Test(priority = 3)
  public void logout() {
//	  System.out.println("logout test case");
	  throw new SkipException("Exception");
  }
  
//  @Test
//  public void f() {
//  }
//  
//  @Test
//  public void f() {
//  }
//  
//  @Test
//  public void f() {
//  }
}
