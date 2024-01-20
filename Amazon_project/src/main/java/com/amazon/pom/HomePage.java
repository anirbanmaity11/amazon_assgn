package com.amazon.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
@FindBy(id = "nav-link-accountList")
private WebElement signInBtn;
@FindBy(id="ap_email")
private WebElement emailTbx;
@FindBy(id="continue")
private WebElement continueBtn;
@FindBy(id="ap_password")
private WebElement passwordTbx;
@FindBy(id="signInSubmit")
private WebElement signInSubmitBtn;
@FindBy(id="nav-link-accountList")
private WebElement accountListTab;
@FindBy(xpath="//span[text()='Sign Out']")
private WebElement signOutBtn;
@FindBy(id="twotabsearchtextbox")
private WebElement searchBox;
@FindBy(xpath="//div[contains(text(),'iphone')]")
private List<WebElement> suggs;
@FindBy(xpath="//*[text()='Electronics']")
private WebElement electronicsOption;
@FindBy(id="nav-search-dropdown-card")
private WebElement searchDropdown;

@FindBy(id="nav-search-submit-button")
private WebElement submitBtn;
@FindBy(id="nav-cart")
private WebElement cart;
@FindBy(xpath="//input[@value='Delete']")
private WebElement deleteBtn;
@FindBy(xpath="//input[@value='Save for later']")
private WebElement saveForLaterBtn;
@FindBy(xpath="//h2[contains(text(),'Your Items')]/../..//input[@data-action='move-to-cart']")
private WebElement MoveToCartBtn;
@FindBy(id="glow-ingress-block")
private WebElement pincodeTab;

public WebElement getCreateWishListlink() {
	return createWishListlink;
}
@FindBy(xpath="//span[text()='Create a Wish List']")
private WebElement createWishListlink;

@FindBy(id="list-name")
private WebElement wishlistnametbx;

public WebElement getWishlistnametbx() {
	return wishlistnametbx;
}

@FindBy(xpath="//span[contains(text(),'Back to top')]")
private WebElement backToTopTab;

public WebElement getBackToTopTab() {
	return backToTopTab;
}

@FindBy(className="icp-nav-link-inner")
private WebElement languageButton;

public WebElement getLanguageButton() {
	return languageButton;
}

@FindBy(xpath="(//span[@dir='ltr'])[3]")
private WebElement hindiRadiobtn;

public WebElement getHindiRadiobtn() {
	return hindiRadiobtn;
}

@FindBy(id="icp-save-button-announce")
private WebElement submitLanguagebtn;

public WebElement getSubmitLanguagebtn() {
	return submitLanguagebtn;
}

@FindBy(xpath="//span[@class='nav-line-2']/div")
private WebElement changedLanguagebtn;

@FindBy(xpath="//a[text()='Careers']")
private WebElement careersBtn;


public WebElement getCareersBtn() {
	return careersBtn;
}
public WebElement getChangedLanguagebtn() {
	return changedLanguagebtn;
}
@FindBy(id="GLUXZipUpdateInput")
private WebElement pincodeTbx;
@FindBy(id="GLUXZipUpdate")
private WebElement pincodeSubmitBtn;
@FindBy(id="nav-logo-sprites")
private WebElement amazonLogo;
@FindBy(id="nav-hamburger-menu")
private WebElement hamburgerMenu;
@FindBy(id="hmenu-customer-name")
private WebElement customerNameTab;
public WebElement getCustomerNameTab() {
	return customerNameTab;
}
public WebElement getYourOrders() {
	return yourOrders;
}
@FindBy(xpath="(//div[@class='a-row'])[1]")
private WebElement yourOrders;
@FindBy(id="nav-logo-sprites")
private List<WebElement> allOptions;
public WebElement getHamburgerMenu() {
	return hamburgerMenu;
}
public List<WebElement> getAllOptions() {
	return allOptions;
}
public WebElement getAmazonLogo() {
	return amazonLogo;
}
public WebElement getPincodeTab() {
	return pincodeTab;
}
public WebElement getPincodeTbx() {
	return pincodeTbx;
}
public WebElement getPincodeSubmitBtn() {
	return pincodeSubmitBtn;
}
public WebElement getSaveForLaterBtn() {
	return saveForLaterBtn;
}
public WebElement getMoveToCartBtn() {
	return MoveToCartBtn;
}
public WebElement getCart() {
	return cart;
}
public WebElement getDeleteBtn() {
	return deleteBtn;
}
@FindBy(xpath="//span[text()='Category']/../../ul/li/span/span")
private WebElement categoryOption;

public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void login() throws InterruptedException{
	Thread.sleep(2000);
	signInBtn.click();Thread.sleep(2000);
	emailTbx.sendKeys("anirbanmaity11@gmail.com");Thread.sleep(2000);
	continueBtn.click();Thread.sleep(2000);
	passwordTbx.sendKeys("anirban@123");Thread.sleep(2000);
	signInSubmitBtn.click();Thread.sleep(2000);
	}
public void logout() throws InterruptedException {
	Actions a=new Actions(driver);
	a.moveToElement(accountListTab).perform();Thread.sleep(2000);
	signOutBtn.click();Thread.sleep(2000);
}
public WebElement getSearchBox() {
	return searchBox;
}
public List<WebElement> getSuggs() {
	return suggs;
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getSignInBtn() {
	return signInBtn;
}
public WebElement getEmailTbx() {
	return emailTbx;
}
public WebElement getContinueBtn() {
	return continueBtn;
}
public WebElement getPasswordTbx() {
	return passwordTbx;
}
public WebElement getSignInSubmitBtn() {
	return signInSubmitBtn;
}
public WebElement getAccountListTab() {
	return accountListTab;
}
public WebElement getSignOutBtn() {
	return signOutBtn;
}
public WebElement getElectronicsOption() {
	return electronicsOption;
}
public WebElement getSearchDropdown() {
	return searchDropdown;
}
public WebElement getSubmitBtn() {
	return submitBtn;
}
public WebElement getCategoryOption() {
	return categoryOption;
}
}
