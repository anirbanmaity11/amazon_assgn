package com.amazon.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	@FindBy(xpath = "//span[text()='Brand']/../..//span[text()='Allen Solly']")
	private WebElement allenSollyBrand;
	@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base']")
	private WebElement brandName;
	@FindBy(id  = "s-result-sort-select")
	private WebElement sortDropdown;
	@FindBy(linkText  = "Price: Low to High")
	private WebElement lowToHigh;
	@FindBy(className   = "s-image")
	private WebElement product;
	@FindBy(xpath   = "(//span[@class='a-size-base a-color-base'])[1]")
	private WebElement ratings;
	@FindBy(id  = "quantity")
	private WebElement quantityDropdown;
	@FindBy(id   = "add-to-cart-button")
	private WebElement addToCartBtn;
	@FindBy(xpath   = "//span[contains(text(),'Added to Cart')]")
	private WebElement message;
	@FindBy(id  = "buy-now-button")
	private WebElement buyNowBtn;
	public WebElement getBuyNowBtn() {
		return buyNowBtn;
	}

	@FindBy(id  = "address-ui-widgets-enterAddressFullName")
	private WebElement fullNameTbx;
	@FindBy(id  = "address-ui-widgets-enterAddressPhoneNumber")
	private WebElement mobNumTbx;
	@FindBy(id  = "address-ui-widgets-enterAddressLine1")
	private WebElement addLine1;
	@FindBy(id  = "address-ui-widgets-enterAddressLine2")
	private WebElement addLine2;
	@FindBy(id  = "address-ui-widgets-landmark")
	private WebElement landMarkTbx;
    public WebElement getUseAddressbtn() {
		return useAddressbtn;
	}

	@FindBy(id="address-ui-widgets-form-submit-button-announce")
    private WebElement useAddressbtn;
    
	public WebElement getFullNameTbx() {
		return fullNameTbx;
	}

	public WebElement getMobNumTbx() {
		return mobNumTbx;
	}

	public WebElement getAddLine1() {
		return addLine1;
	}

	public WebElement getAddLine2() {
		return addLine2;
	}

	public WebElement getLandMarkTbx() {
		return landMarkTbx;
	}

	public WebElement getQuantityDropdown() {
		return quantityDropdown;
	}


	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSizeDropdown() {
		return sizeDropdown;
	}

	public List<WebElement> getProductDetails() {
		return productDetails;
	}

	@FindBy(id   = "native_dropdown_selected_size_name")
	private WebElement sizeDropdown;
	@FindBy(xpath   = "//span[@class='a-color-base']")
	private List<WebElement> productDetails;
public WebElement getProduct() {
		return product;
	}

	public WebElement getRatings() {
		return ratings;
	}

public WebElement getSortDropdown() {
		return sortDropdown;
	}

	public WebElement getLowToHigh() {
		return lowToHigh;
	}

public ProductPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAllenSollyBrand() {
	return allenSollyBrand;
}

public WebElement getBrandName() {
	return brandName;
}
}
