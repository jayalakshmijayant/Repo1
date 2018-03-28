package module9TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.as.*;

public class RegistrationTest {
  @Test
  public void doREgister() {
	  //SoftAssert softassert=new SoftAssert();
	  String expectedString="xxxx";
	  String actualString="xxxx1";
		System.out.println("A");
	
	  
	  //Assert.assertEquals(actualString, expectedString);
	 // Assert.assertTrue(2>11, "error message");
	  Assert.assertEquals(actualString, expectedString,"Error not match");
		System.out.println("B");
		//Assert.assertAll();
  }
}
