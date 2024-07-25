package com.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webdriverutility.WebDriverUtility;


public class LoginPage extends WebDriverUtility {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Rule-3 Object Initialization
	@FindBy(name="user_name")
	private WebElement usernameEdit;
	
	@FindBy(name="user_password")
	private WebElement passwordEdit;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement homeVerify;

	 public WebElement getHomeVerify() {
		return homeVerify;
	}

	//Rule-4 Object Encapsulation
	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	                       
	//Rule-5 provide action(BUSINESS METHOD)
	public void loginToApp(String user,String pass,String url)
	{
		waitForPageToLoad(driver);
	    maximizeWindow(driver);
		driver.get(url);
		usernameEdit.sendKeys(user);
		passwordEdit.sendKeys(pass);
		getLoginBtn().click();
	}

}
