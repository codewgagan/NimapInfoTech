package com.qa.nimap.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties props;
	
	public BaseClass() throws IOException {
		props = new Properties();
		try{
			FileInputStream fis = new FileInputStream("C:\\Users\\gowda\\eclipse-workspace\\Nimap_Info_Tech_Test\\src\\main\\resources\\com\\qa\\nimap\\config\\config.properties");
			props.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void Initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowda\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		String browserName = props.getProperty("browser");
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(props.getProperty("url"));
	}
	public void login(String phone_no, String password) throws InterruptedException, IOException {
		driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys(phone_no);
		driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]")).sendKeys(password);
		Thread.sleep(10000);
		System.out.println("Solve the Captcha and press Enter to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id=\"kt_login_signin_submit\"]")).click();
	}

}

