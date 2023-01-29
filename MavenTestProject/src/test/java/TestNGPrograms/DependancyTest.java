package TestNGPrograms;

import org.testng.annotations.Test;

public class DependancyTest {
  @Test(enabled=true,priority=1,expectedExceptions=Exception.class)
  public void openBrowser() {
	  
	  System.out.println("Browser open");
	  int a=10/0;
  }
  @Test(enabled=true,priority=3,dependsOnMethods={"openBrowser","abc"})
  public void login() {
	  System.out.println("Login actitime");
  }
  @Test(priority=2,enabled=true,invocationCount=4)
  public void abc() {
	  System.out.println("hello");
	  
  }
}
