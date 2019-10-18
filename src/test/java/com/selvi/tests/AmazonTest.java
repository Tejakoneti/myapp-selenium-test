package com.selvi.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AmazonTest {

    private WebDriver driver;

    @BeforeTest
    public void setupSelenium(){
    	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Projects\\Drivers\\chromedriver.exe");	
		driver = new ChromeDriver(); 
    }

    @Test
    public void testSearch(){
        driver.get("http://www.amazon.com");		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Assert.assertEquals(driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

    @AfterTest
    public void closeSelenium(){
        driver.quit();
    }
}