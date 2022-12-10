package com.edamama.contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
	
	@FindBy(xpath="//input[@name=\"name\"]") private WebElement Name;
	
	@FindBy(xpath="//input[@name=\"organization\"]") private WebElement Organization;
	
	@FindBy(xpath="//input[@name=\"goals\"]") private WebElement Goal;
	
	@FindBy(xpath="//option[contains(text(),'2-4 weeks')]")private WebElement Duration;
	
	@FindBy(xpath="//option[contains(text(),'$4,750')]")private WebElement Budget;
	
	@FindBy(xpath="//input[@name=\"email\"]") private WebElement Email;

	@FindBy(xpath="//input[@name=\"phone\"]") private WebElement Phone;

	@FindBy(xpath="//span[contains(text(),'Send It!')]") WebElement Send;
	

	public Contact(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void Name(String name) {
		
		Name.sendKeys(name);
	}
	public void Organization(String org) {
		
		Organization.sendKeys(org);
	}
	public void Goal(String gl) {
		
		Goal.sendKeys(gl);
	}
	public void Duration() {
		
		Duration.click();
	}
	public void Budget() {
		
		Budget.click();
	}
	public void Email(String mail) {
		
		Email.sendKeys(mail);
	}
	public void Phone(int ph) {
		
		Phone.sendKeys(String.valueOf(ph));
	}
	public void Send() {
		
		Send.click();
	}
	
}

