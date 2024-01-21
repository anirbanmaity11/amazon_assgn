package com.amazon.testscript;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.amazon.generic.BaseClass;

public class Amazon_UI_Testing extends BaseClass{
	@Test(priority=0)
	public void TC_01() throws InterruptedException {
		h.login();
		h.logout();
	}
	@Test(priority=1)
	public void TC_02() throws InterruptedException {
		h.login();
		h.getSearchBox().sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> suggs = h.getSuggs();
		Thread.sleep(2000);
		String expectedValue = suggs.get(2).getText();
		suggs.get(2).click();
		Thread.sleep(2000);
		String actualValue = h.getSearchBox().getAttribute("value");
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualValue, expectedValue);
		s.assertAll();
	}
	@Test(priority=2)
	public void TC_03() throws InterruptedException {
		h.getSearchDropdown().click();
		h.getElectronicsOption().click();
		h.getSubmitBtn().click();
		String category = h.getCategoryOption().getText();
		String expCategory = "Electronics";
		SoftAssert s=new SoftAssert();
		s.assertEquals(category,expCategory );	
		s.assertAll();
	}
	@Test(priority=3)
	public void TC_04() throws InterruptedException {
		h.getSearchBox().sendKeys("t shirts for man");
		h.getSubmitBtn().click();
		Thread.sleep(5000);
		p.getAllenSollyBrand().click();
		String actualBrand = p.getBrandName().getText();
		String expBrand = "Allen Solly";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualBrand,expBrand );	
		s.assertAll();
	}
	@Test(priority=4)
	public void TC_05() throws InterruptedException {
		h.getSearchBox().sendKeys("t shirts for man");
		h.getSubmitBtn().click();
		Select select=new Select(p.getSortDropdown());
		select.selectByIndex(1);
		String actSortOption = select.getFirstSelectedOption().getText();
		String expSortOption="Price: Low to High";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actSortOption,expSortOption );
		s.assertAll();
	}
	@Test(priority=5)
	public void TC_06() throws InterruptedException {
		h.getSearchBox().sendKeys("t shirts for man");
		h.getSubmitBtn().click();
		p.getProduct().click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		}
		String ratings = p.getRatings().getText();
		Reporter.log("Ratings of the product: "+ratings,true);
	}
	@Test(priority=6)
	public void TC_07() throws InterruptedException {
		h.getSearchBox().sendKeys("t shirts for man");
		h.getSubmitBtn().click();
		p.getProduct().click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		}
		Select s=new Select(p.getSizeDropdown());
		s.selectByVisibleText("M");
		List<WebElement> pdetails =p.getProductDetails();
		for( WebElement detail:pdetails) {
			String text = detail.getText();
			Reporter.log(text,true);
		}
	}
	@Test(priority=7)
	public void TC_08() throws InterruptedException {
		h.getSearchBox().sendKeys("t shirts for man");
		h.getSubmitBtn().click();
		p.getProduct().click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		}
		Thread.sleep(2000);
		Select select=new Select(p.getQuantityDropdown());
		select.selectByIndex(2);
		Thread.sleep(2000);
		p.getAddToCartBtn().click();Thread.sleep(2000);
		boolean res = p.getMessage().isDisplayed();
		SoftAssert s=new SoftAssert();
		s.assertTrue(res);
		s.assertAll();
	}
	@Test(priority=8)
	public void TC_09() throws InterruptedException {
		h.getCart().click();
		h.getDeleteBtn().click();
	}
	@Test(priority=9)
	public void TC_10() throws InterruptedException {
		h.getCart().click();
		h.getSaveForLaterBtn().click();
	}
	@Test(priority=10)
	public void TC_11() throws InterruptedException {
		h.getCart().click();
		h.getMoveToCartBtn().click();
	}
	@Test(priority=11)
	public void TC_12() throws InterruptedException {
		h.getPincodeTab().click();
		h.getPincodeTbx().sendKeys("700074");
		h.getPincodeSubmitBtn().click();
	}
	@Test(priority=12)
	public void TC_13() throws InterruptedException {
		h.getSearchBox().sendKeys("t shirts for man");
		h.getSubmitBtn().click();
		h.getAmazonLogo().click();
		String actualTitle = driver.getTitle();
		String expectedTitle="Online Shopping site in India";
		if(actualTitle.contains(expectedTitle)) {
			Reporter.log("Pass",true);
		}
		else {
			Reporter.log("Both title are not same",true);
			Assert.fail();
		}
	}
	@Test(priority=13)
	public void TC_14() throws InterruptedException {
		h.getHamburgerMenu().click();
		Thread.sleep(2000);
		List<WebElement> navBar =h.getAllOptions();
		for (WebElement ele : navBar) {
			System.out.println(ele.getText());
		}
	}
	@Test(priority=14)
	public void TC_15() throws InterruptedException {
		h.getHamburgerMenu().click();
		h.getCustomerNameTab().click();
		SoftAssert s=new SoftAssert();
		String aTitle = driver.getTitle();
		String etitle="Your Account";
		s.assertEquals(aTitle, etitle);
		h.getYourOrders().click();
		String aTitle2 = driver.getTitle();
		String etitle2="Your Orders";
		s.assertEquals(aTitle2, etitle2);
		s.assertAll();
	}
	@Test(priority=15)
	public void TC_16() throws InterruptedException {
		h.getSearchBox().sendKeys("t shirts for man");
		h.getSubmitBtn().click();
		p.getProduct().click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		}
		p.getBuyNowBtn().click();
		p.getFullNameTbx().sendKeys("Anirban");
		p.getMobNumTbx().sendKeys("8759064707");
		p.getAddLine1().sendKeys("39/A,Dumdum Road");
		p.getAddLine2().sendKeys("DumDum");
		p.getLandMarkTbx().sendKeys("Dumdum Metro Station");
//		p.getUseAddressbtn().click();
	}
	@Test(priority=16)
	public void TC_17() throws InterruptedException {
		WebElement ele =h.getAccountListTab();
		Actions a=new Actions(driver);
	    a.moveToElement(ele).perform();
		h.getCreateWishListlink().click();
		h.getWishlistnametbx().sendKeys("My-List");
	}
	@Test(priority=19)
	public void TC_18() throws InterruptedException {;
	h.getLanguageButton().click();
	h.getHindiRadiobtn().click();
	Thread.sleep(2000);
	h.getSubmitLanguagebtn().click();
	String actuallanguage="HI";
	Thread.sleep(2000);
	String changeLanguage =h.getChangedLanguagebtn().getText();
	Reporter.log(changeLanguage, true);
	SoftAssert s=new SoftAssert();
	s.assertEquals(changeLanguage, actuallanguage);
	s.assertAll();
	}
	@Test(priority=17)
	public void TC_19() throws InterruptedException {
	int y=h.getBackToTopTab().getLocation().getY();	
	Thread.sleep(3000);
	 JavascriptExecutor j=(JavascriptExecutor)driver;
	 j.executeScript("window.scrollTo(0,"+y+")");
	}
	@Test(priority=18)
	public void TC_20() throws InterruptedException {
		h.getCareersBtn().click();
		j.getHamburgerBtn().click();
		j.getJobCategoryLink().click();
		j.getSoftwareDevLink().click();
		String actualTitle = driver.getTitle();
		String expTitle = "Software Development";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expTitle);
		s.assertAll();
				
	}
}	
