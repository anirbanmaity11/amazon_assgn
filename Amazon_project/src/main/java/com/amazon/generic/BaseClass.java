package com.amazon.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.amazon.pom.HomePage;
import com.amazon.pom.JobPage;
import com.amazon.pom.ProductPage;

public class BaseClass {
	public static WebDriver driver;
	public HomePage h;
	public ProductPage p;
	public JobPage j;
	@BeforeTest
	public void openBrowser() {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		h=new HomePage(driver);
		p=new ProductPage(driver);
		j=new JobPage(driver);
	}
	@BeforeMethod
	public void triggerUrl() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.amazon.in");
	}
	@AfterTest
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
