package com.qa.nimap.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.nimap.BaseClass.BaseClass;
import com.qa.nimap.Pages.PunchIn;

public class PunchInTestCase extends BaseClass {

	public PunchInTestCase() throws IOException {
		super();
		
	}
	PunchIn pi;

	@BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{
		Initialization();
		login(props.getProperty("mobile_no"),props.getProperty("password"));
		pi = new PunchIn();
	}
	@Test
	public void punchIn() throws InterruptedException {
		pi.punch_in();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
