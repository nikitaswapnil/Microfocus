package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.CreateNewAccount;

public class CreateNewAccountTest extends BaseClass {
	@BeforeTest
	
	public void setUp() {
		BaseClass.initialization();
	}
	
	@Test
	public void validateNewAccount(){
		CreateNewAccount createNewAccount=new CreateNewAccount();
		createNewAccount.CreateNewAccountFun("nikita", "patil", "tester", "xyz", "kolhapur", "451241", "India", "Kerala (India)", "English (Botswana)", "(GMT+5:30)  India" , "457845125", "nikita@123");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
