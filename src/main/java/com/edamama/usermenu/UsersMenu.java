package com.edamama.usermenu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.edamama.util.Util;

public class UsersMenu {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", new Util().getDriverPath());
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.get("https://www.edamama.ph/shop");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'No Thanks!')]")).click();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		
		
		driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys("shrawaneevs@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]")).sendKeys("jgd@13May");
		
		driver.findElement(By.xpath("//span[contains(text(),' CONTINUE') ]")).click();
		
		
		driver.findElement(By.xpath("//mat-icon[contains(text(),'keyboard_arrow_down')]")).click();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'My Orders')]")).click();
	}

}
