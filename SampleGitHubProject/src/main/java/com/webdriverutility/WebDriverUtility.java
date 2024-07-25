package com.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}

	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void waitForElementPresent(WebElement element, WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
//	public void switchToTabOnTitle(WebDriver driver,String partialtitle)
//	{
//		Set<String> win = driver.getWindowHandles();
//		 Iterator<String> it=win.iterator();
//		 while(it.hasNext())
//		 {
//			 String windowid=it.next();
//			 driver.switchTo().window(windowid);
//			 String actualurl = driver.getCurrentUrl();
//			 if(actualurl.contains(partialtitle))
//			 {
//				 break;
//			 }
//		 }
//	}
	
	public void switchToTabonUrl(WebDriver driver, String title)
	{
//		 String parentWindow=driver.getWindowHandle();

		  Set<String> childWindows=driver.getWindowHandles();
		
		  for(String window: childWindows)
		  {
			  driver.switchTo().window(window);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
			  String actualurl = driver.getCurrentUrl();
			  if(actualurl.contains(title))
			  {
			 break;
			  }
		  }
	}
	
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver,String nameID)
	{
		driver.switchTo().frame(nameID);
	}
	
	public void switchToFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	
	public void switchToAlertAndCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchToAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public String switchToAlertAndGetText(WebDriver driver)
	{
		String text=driver.switchTo().alert().getText();
		return text;
	}
	
	public void select(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void select(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectByValue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void mouseMoveOnElement(WebDriver driver, WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();;
	}
	
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();;
	}
	
	public void rightClick(WebDriver driver, WebElement element)
	{
		Actions action=new Actions(driver);
		action.contextClick(element).perform();;
	}
	
	public void dragAndDrop(WebDriver driver, WebElement source,WebElement target)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(source,target).perform();;
	}
}
