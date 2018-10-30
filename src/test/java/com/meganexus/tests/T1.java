package com.meganexus.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.EdgeDriverManager;

public class T1 {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	public static WebDriver driver;
	Proxy proxy;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite will always execute prior to all annotations or tests in the suite.");
		System.out.println("launching browser");
		EdgeDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(
				"After suite will always execute at last when all the annotations or test in the suite have run.");
		if (driver != null) {
			System.out.println("Closing browser");
			driver.quit();

		}

	}

	@BeforeTest
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/test1Report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		 extent.setSystemInfo("OS", "windows");
		 extent.setSystemInfo("Browser", "Microsoftedge");

		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Extent Report Test1");
		htmlReporter.config().setReportName("Test1 Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	}
		
		
	

	@AfterTest
	public void tearDown() {
		extent.flush();
	}
	public static String capture(WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("test-output/ErrImages/" + System.currentTimeMillis()
		+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}


	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.out.println(
				"Before Class will always execute prior to Before Method and Test Method and maximize the window");
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class will always execute later to After Method and Test method");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}

	@Test(invocationCount = 1, invocationTimeOut = 10, groups = "extent")

	public void testCasea() {
		test = extent.createTest("Test Case a", "Fail test case");
		System.out.println("@@@@@@@@@@@@@" + proxy.getHttpProxy());
	}

	@Test
	public void testCaseb() throws InterruptedException {
		test = extent.createTest("Test Case b", "PASSED test case");
		Thread.sleep(3000);
		System.out.println(driver.getTitle() + "~~~~~~~~~~~~~~~~~~" + driver.getCurrentUrl());
	}

	@Test
	public void testCasec() {
		test = extent.createTest("Test Case c", "PASSED test case");
	}

	@Test
	public void testCased() {
		test = extent.createTest("Test Case d", "PASSED test case");
	}

	//@Test(dependsOnGroups = "extent",expectedExceptions=SkipException.class)
	@Test()
	public void testCasee() {
		test = extent.createTest("Test Case e", "Skip test case");
		System.out.println("Executed Successfully");
		throw new SkipException("Skipping this exception");
		
	}

	@Test(enabled = false)
	public void testCasef() {
		test = extent.createTest("Test Case f", "I'm Not Ready, please don't execute me");
	}
}
