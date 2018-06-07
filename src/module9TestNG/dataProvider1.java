package module9TestNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataProvider1 {
	@DataProvider(name="StudentName")
	public static Object[] studentNameID(Method m){
		Object obj[]=null;
		
		if(m.getName().equals("newNameSearch")){
			obj=new Object[4];
			
			obj[0]="Sai";
			obj[1]="Deva";
			obj[2]="Amuthan";
			obj[3]="Jaya";
			//return obj;
		}else if(m.getName().equals("newIDSearch")){
			obj=new Object[4];
			obj[0]=12;
			obj[1]=23;
			obj[2]=34;
			obj[3]=45;
			//return obj;
		}
		//return obj;
		return obj;
		
	}
}
