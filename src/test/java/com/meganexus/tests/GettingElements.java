package com.meganexus.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.meganexus.GenericLib.ReadProperties;
import com.meganexus.GenericLib.TestBase;
import com.meganexus.pageObjLib.LoginPage;

public class GettingElements extends TestBase {
public static void main(String[] args) throws InterruptedException {
	Startup();
	entercredentials();
	getTitle();
}
public static void Startup() {
	String browser = ReadProperties.getInstance().getProperty("browserType");

	open_Browser(browser);
	driver.manage().window().maximize();

	String URL = ReadProperties.getInstance().getProperty("testsiteBaseURL");
	TestBase.enter_URL(URL);
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

public static void entercredentials() throws InterruptedException {
	try {
		PageFactory.initElements(TestBase.driver, LoginPage.class);
		String userName = ReadProperties.getInstance().getProperty("username");
		String passWord = ReadProperties.getInstance().getProperty("password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();

	} catch (ElementNotVisibleException e) {
		System.out.println("xpath not correct");
	} catch (NullPointerException n) {
		System.out.println("Unable to get property value " + n.getMessage());
	}
}
public static void getTitle() {
	String j = driver.getTitle();
	  System.out.println("Your page title Is : "+j);
	  Assert.assertEquals("My Service Users",j);
	 // Assert.assertEquals("My Service Users",driver.getTitle());
	
}
}
