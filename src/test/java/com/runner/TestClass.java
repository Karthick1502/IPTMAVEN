package com.runner;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base_Class;

public class TestClass extends Base_Class {
	public static void main(String[] args) throws Exception {
		
		
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement searchInput = driver.findElement(By.name("q"));
//		sendInput(searchInput, "karthick");
//		WebElement link_to_gmail = driver.findElement(By.xpath("//a[text() ='Gmail']"));
//		click(link_to_gmail);
//		select(link_to_gmail, "index", "0");
//		windowHandles(1);
		
//		navigateTo("https://demoqa.com/alerts");
//		Thread.sleep(3000);
//		navigation("back");
//		Thread.sleep(3000);
//		navigation("forward");
//		Thread.sleep(3000);
//		navigation("refresh");
//		waitImplicitly(30);
//		driver.findElement(By.xpath("//a[text() ='Alert with Textbox ']")).click();
		
//		Thread.sleep(3000);
//		WebElement promptBox =  driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
//		click(promptBox);
//		Alert alert = alert();
//		Thread.sleep(3000);
//		alertAction(alert, "accept");
//		alertAction(alert, "dismiss");
//		inputAlert(alert, "karthick");
//		alertAction(alert, "accept");
//		
//		captureScreenshot("alert");
//		System.out.println(get("get_title"));
//		System.out.println(get("get_current_url"));
//		System.out.println(isFunction(promptBox, "displayed"));
//		System.out.println(isFunction(promptBox, "enabled"));
//		System.out.println(isFunction(promptBox, "selected"));
		
//		WebElement emailinput = driver.findElement(By.xpath("(//span[text() = 'ciencias'])[3]"));
//		scrollUsingWebElement(emailinput , "scrollAndClick");
		
//		WebElement element = driver.findElement(By.id("email"));
		scrollAndSendKeysById("email", "karhtick");
		
//		quitBrowser();
	}

	

}
