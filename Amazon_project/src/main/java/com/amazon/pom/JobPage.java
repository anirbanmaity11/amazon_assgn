package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPage {
	@FindBy(xpath="//div[@class='hamburger d-inline-block hamburger-icon']")
	private WebElement hamburgerBtn;
	@FindBy(linkText ="Job categories")
	private WebElement jobCategoryLink;
	@FindBy(xpath ="//h3[text()='Software Development']")
	private WebElement softwareDevLink;

public WebElement getHamburgerBtn() {
		return hamburgerBtn;
	}

	public WebElement getJobCategoryLink() {
		return jobCategoryLink;
	}

	public WebElement getSoftwareDevLink() {
		return softwareDevLink;
	}

public JobPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
