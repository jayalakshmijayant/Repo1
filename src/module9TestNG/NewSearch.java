package module9TestNG;

import org.testng.annotations.Test;

public class NewSearch {
	@Test(priority=1,dataProviderClass=dataProvider1.class,dataProvider="StudentName")
	public void newNameSearch(String name){
	System.out.println("search with name : "+name);
	}
	
	@Test(priority=2,dataProviderClass=dataProvider1.class,dataProvider="StudentName")
	public void newIDSearch(int StudID){
		System.out.println("Search with student ID : "+StudID);
	}
	@Test(priority=3)
	public void displayDetails(){
		System.out.println("Fetch and Display student data... ");
	}
	
}
