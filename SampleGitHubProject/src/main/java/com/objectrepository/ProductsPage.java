package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

WebDriver driver;
	
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement createNewProdButton;
	
	@FindBy(name = "search_text")
	private WebElement searchtextEdit;
	
	@FindBy(id = "bas_searchfield")
	private WebElement searchDd;
	
	@FindBy(name = "submit")
	private WebElement searchBtn;
	
	@FindBy(xpath = "(//a[text()='Products'])[2]")
	private WebElement verifyText;

	public WebElement getVerifyText() {
		return verifyText;
	}

	public WebElement getsearchBtn() {
		return searchBtn;
	}

	public WebElement getSearchDd() {
		return searchDd;
	}

	public WebElement getSearchtextEdit() {
		return searchtextEdit;
	}

	public WebElement getCreateNewProdButton() {
		return createNewProdButton;
	}
}
