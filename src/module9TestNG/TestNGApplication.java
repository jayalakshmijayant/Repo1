package module9TestNG;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGApplication {
	
	@BeforeTest
	public void beforeTEst(){
		System.out.println("Before starting the testcase");
	}
	@AfterTest
	public void afterTEst(){
		System.out.println("AFter finishing all the tests..");
	}
	
	@BeforeMethod
	public void beforeMthod(){
		System.out.println("Before every test in the class");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("After every test in this class.");
	}
@Test(priority=1)
public void doLogin(){
	System.out.println("login test");
}
@Test(priority=3)
public void LogoutTEst(){
	System.out.println("logout test");
}
@Test(priority=2)
public void updateNameTEst(){
	throw new SkipException("skipping the test");
	//System.out.println("name update test..");
}
}
