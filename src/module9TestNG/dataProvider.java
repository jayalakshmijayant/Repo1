package module9TestNG;

import org.testng.annotations.DataProvider;

	public class dataProvider {
		@DataProvider(name="StudentName")
		public static Object[] studentName(){
			Object[] obj=new Object[4];
			obj[0]="Sai";
			obj[1]="Deva";
			obj[2]="Amuthan";
			obj[3]="Jaya";
			return obj;
			
		}
		
		@DataProvider(name="StudentID")
		public static Object[] studentID(){
			Object[] obj=new Object[4];
			obj[0]=12;
			obj[1]=23;
			obj[2]=34;
			obj[3]=45;
			return obj;
		}
		
	}
