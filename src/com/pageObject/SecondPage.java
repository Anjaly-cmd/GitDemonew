package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPage {
	WebDriver driver;
	WebDriverWait wait;
	By refundable= By.xpath("//div[@class='flightFilterOptions']//child::input[@id='filterRefundableOnly']");
	By Bookbutton = By.xpath("//a[@class='button book yellow dataCommunicationBound buttonBound customButton']");

	public SecondPage(WebDriver browserFromMain) {
		// TODO Auto-generated constructor stub
		
		this.driver = browserFromMain;
		this.wait = new WebDriverWait(driver, 30); //to give time for driver init
		
		}
  public void Refundable()
  {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(refundable)).click();
  }
  public void Bookbutton()
  {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(Bookbutton)).click();
  }


}
