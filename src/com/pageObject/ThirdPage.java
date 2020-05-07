package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirdPage {
	WebDriver driver;
	WebDriverWait wait;
	
	By Title = By.xpath("//li[@data-travelertype='1']//child::select[@tabindex='1']");
	By Firstname = By.xpath("//li[@data-travelertype='1']//child::select[@tabindex='1']");
	public ThirdPage(WebDriver browserFromMain) {
		// TODO Auto-generated constructor stub
		
		this.driver = browserFromMain;
		this.wait = new WebDriverWait(driver, 30); //to give time for driver init
	}
public void selectTitle()
{
	WebElement title =wait.until(ExpectedConditions.visibilityOfElementLocated(Title)); 
	// here selection is happening not clicking
	Select sel = new Select(title);
	sel.selectByVisibleText("Ms");
}
}
