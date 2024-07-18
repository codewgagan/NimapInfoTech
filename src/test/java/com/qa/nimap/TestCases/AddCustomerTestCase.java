package com.qa.nimap.TestCases;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.nimap.BaseClass.BaseClass;
import com.qa.nimap.Pages.AddCustomer;

public class AddCustomerTestCase extends BaseClass{

	public AddCustomerTestCase() throws IOException {
		super();
		
	}
AddCustomer addCust;
	
	@BeforeMethod
	public void signUp() throws IOException, InterruptedException {
		Initialization();
		login(props.getProperty("mobile_no"),props.getProperty("password"));
		addCust = new AddCustomer();
	}
	
	@Test
	public void add_customer() throws InterruptedException {
		addCust.customerAdd();
	}
	@Test
	public void verifyCust() {
		addCust.verifycustmoer();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
