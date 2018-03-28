package module9TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@AfterMethod
	public void afterMthd(){
		System.out.println("browser closing....");
	}
	@BeforeMethod
	public void beforemthd(){
		System.out.println("browser opening.....");
	}
	@Test(dataProvider="getData")
	public void doLoginTEst(String username,String password,String browser){
		System.out.println("username: "+username);
		System.out.println("password: "+password);
		System.out.println("Browser: "+browser);
	}
@DataProvider
public Object[][] getData(){
	Object[][] obj=new Object[3][3];
	//1st row
	obj[0][0]="U1";
	obj[0][1]="P1";
	obj[0][2]="Mozilla";
	
	//2nd row
	obj[1][0]="U2";
	obj[1][1]="p2";
	obj[1][2]="IE";
	
	//3rd row
	
	obj[2][0]="U3";
	obj[2][1]="p3";
	obj[2][2]="edge";
	
	return obj;
}
}
