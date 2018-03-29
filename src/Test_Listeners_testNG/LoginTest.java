package Test_Listeners_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class LoginTest {
//public SoftAssert s= new SoftAssert();
@Test
public void loginTest(){
	
	System.out.println("Login test");
	System.out.println("Start of case");
	// in order to stop the program from ending abruptly, use try catch block
	try{
	Assert.assertEquals("a","x");

	}catch(Throwable t){
		System.out.println("Error message : "+ t.getMessage());
		ErrorUtil.addVerificationFailure(t);
	}
	try{
		Assert.assertEquals("b","c");
		
		
		}catch(Throwable t){
			System.out.println("Error message : "+ t.getMessage());
			ErrorUtil.addVerificationFailure(t);
		}
	System.out.println("End of case");
}
@Test
public void loginTest1(){
	System.out.println("Login test 1");
}

}
