package com.edamama.contact;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.edamama.util.Util;

public class TestContact {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException, URISyntaxException {

		Util util = new Util();
		
		FileInputStream excel = new FileInputStream(util.getTestDataPath());
		
		Sheet sh = WorkbookFactory.create(excel).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver",util.getDriverPath());
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.stoodeo.com");
		
		driver.findElement(By.xpath("//span[contains(text(),'Contact')]")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Contact ct = new Contact(driver);
		Thread.sleep(2000);
		
		//Fetch Name from excel
		String nm = sh.getRow(2).getCell(0).getStringCellValue();
		Thread.sleep(2000);
		ct.Name(nm);
		Thread.sleep(2000);

		String org = sh.getRow(2).getCell(1).getStringCellValue();
		Thread.sleep(2000);
		ct.Organization(org);
		Thread.sleep(2000);
		
		String gl = sh.getRow(2).getCell(2).getStringCellValue();
		Thread.sleep(2000);
		ct.Goal(gl);
		Thread.sleep(2000);
		
		ct.Duration();
		Thread.sleep(2000);
		
		ct.Budget();
		Thread.sleep(2000);
		
		String mail = sh.getRow(2).getCell(3).getStringCellValue();
		Thread.sleep(2000);
		ct.Email(mail);
		Thread.sleep(2000);
		
		int ph = (int) sh.getRow(2).getCell(4).getNumericCellValue();
		Thread.sleep(2000);
		ct.Phone(ph);
		Thread.sleep(2000);
		
		ct.Send();
		Thread.sleep(2000);
	}

}
