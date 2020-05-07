package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By origin = By.xpath("//input[@name='Origin']");
	By dest = By.xpath("//input[@name='Destination']");
	By startdate = By.xpath("//input[@name='StartDate']");
	By enddate = By.xpath("//input[@name='EndDate']");
	By adultcount =By.xpath("//select[@name='AdultsFlight']");
	By FindButton = By.xpath("//i[text()='Find flights']");

	public SearchPage(WebDriver browserFromMain) {
		// TODO Auto-generated constructor stub
		this.driver = browserFromMain;
		this.wait = new WebDriverWait(driver, 30);
	}
	
	public void enterSource() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(origin)).sendKeys("Kochi, India (COK)");
	}
	public void enterDest() {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(dest)).sendKeys("Kochi, India (COK)");
		driver.findElement(dest).sendKeys("Bengaluru, India (BLR)");
	}
	
	public void StartDate()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(startdate)).sendKeys("16/09/20");
	}
	
	public void EndDate()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(enddate)).sendKeys("18/09/20");
		driver.findElement(By.xpath("//input[@name='Origin']")).click();
	}
	
	public void AddAdults()
	{
		WebElement adult =wait.until(ExpectedConditions.visibilityOfElementLocated(adultcount)); 
		// here selection is happening not clicking
		Select sel = new Select(adult);
		sel.selectByVisibleText("1 adult");
	}
	
	public void FindFlight()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(FindButton)).click();
	}
	
}
