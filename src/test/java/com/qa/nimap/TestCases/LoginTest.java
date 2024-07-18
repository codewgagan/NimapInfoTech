package com.qa.nimap.TestCases;

import java.io.IOException;

//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.nimap.BaseClass.BaseClass;
import com.qa.nimap.Pages.Login;

public class LoginTest extends BaseClass{

	public LoginTest() throws IOException {
		super();
		
	}
	Login lp;
	@BeforeMethod
	public void setUp() throws IOException {
		Initialization();
		//login(props.getProperty("9321630298"),props.getProperty("nimap321"));
		lp = new Login();
		
	}
	@Parameters({"mobile_no","password"})
	@Test
	public void loginNimap(String mobile_no, String password) throws InterruptedException, IOException {
		lp.login(mobile_no, password);
	}

}
