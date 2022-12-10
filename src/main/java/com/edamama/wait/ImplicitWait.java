package com.edamama.wait;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.edamama.util.Util;

public class ImplicitWait {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args)
	{
		System.out.println("Inside ImplicitWait class");
		ImplicitWait implicitWait = new ImplicitWait();
		implicitWait.excute(new Util().getDriverPath());
	}
	
	public void excute(String path) {
		System.out.println("Inside excute");
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
	}

}
