package com.qa.nimap.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.nimap.BaseClass.BaseClass;

public class PunchIn extends BaseClass{

	public PunchIn() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"kt_header\"]/kt-topbar/div/kt-user-punch/div/div[2]/button")WebElement punchIn_btn;
	
	public void punch_in() throws InterruptedException {
		punchIn_btn.click();
//		String alertMsg = driver.switchTo().alert().getText();
//		System.out.println(alertMsg);
		Thread.sleep(3000);
	}
}
