package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageObject.SearchPage;
import com.pageObject.SecondPage;
import com.pageObject.ThirdPage;

public class PageObjectMainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.musafir.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		SearchPage oSearch = new SearchPage(driver);
		
		oSearch.enterSource();
		oSearch.enterDest();
		oSearch.StartDate();
		oSearch.EndDate();
		oSearch.AddAdults();
		oSearch.FindFlight();
		
		
		SecondPage sec =new SecondPage(driver);
		sec.Refundable();
		sec.Bookbutton();
		
		

		ThirdPage third = new ThirdPage(driver);
		third.selectTitle();
		
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
