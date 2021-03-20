package practical;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class T1 {
  @Test
  public void test1() {
	  System.out.println("test1");
  }
  @BeforeMethod
  public void beforeMethod() {
  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

}
