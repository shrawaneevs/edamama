package com.edamama.wait;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args)
	{
		System.out.println("Inside ImplicitWait class");
		ImplicitWait implicitWait = new ImplicitWait();
		implicitWait.excute(implicitWait.getDriverPath());
	}
	
	public String getDriverPath() {
		System.out.println("Inside getName");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("chromedriver.exe").getFile());
		
		String absolutePath = file.getAbsolutePath();
		System.out.println("absolutePath: "+absolutePath);
		return absolutePath;
	}
	
	public void excute(String path) {
		System.out.println("Inside excute");
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
	}

}
