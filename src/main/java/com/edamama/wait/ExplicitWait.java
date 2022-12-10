package com.edamama.wait;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.edamama.util.Util;

public class ExplicitWait {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args)
	{
		System.out.println("Inside ExplicitWait class");
		ExplicitWait explicitWait = new ExplicitWait();
		explicitWait.excute(new Util().getDriverPath());
	}
	
	public void excute(String path) {
		System.out.println("Inside excute");
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Cheese" + Keys.ENTER);
		
	    WebElement value=new WebDriverWait(driver, Duration.ofSeconds(15).getSeconds())
	    		.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class=\"LC20lb MBeuO DKV0Md\"]")));
	    
	    value.click();
	}

}
