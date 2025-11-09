//package com.Muthu;
//
//import org.junit.Assert;
//import org.junit.platform.commons.function.Try;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class Bass_Class {
//public static WebDriver driver;
//
//    protected static WebDriver launchBrowser(String browsername) {
//    	try {
//		if (browsername.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//			}
//		else if(browsername.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		}
//		else if (browsername.equalsIgnoreCase("edge")) {
//			driver = new EdgeDriver();
//		}
//		} catch (Exception e) {
//          Assert.fail("ERROR : OCCURS DURING BROWSER LAUNCH");
//		}
//    	driver.manage().window().maximize();
//		return driver;
//    }
//    protected static void launchUrl(String url) {
//    	try {
//    		driver.get(url);
//		} catch (Exception e) {
//			Assert.fail("ERROR: OCCURS DURING GET URL");
//		}
//    }
//    protected static void quitBrowser() {
//      try {
//    	  driver.quit();
//	} catch (Exception e) {
//		Assert.fail("ERROR: OCCURS DURING QUITBROWSER");
//	}
//	}
//    protected static void select(WebElement element,String type,String value) {
//    	try {
//    		Select select = new Select(element);
//			if (type.equalsIgnoreCase("index")) {
//				select.selectByIndex(Integer.parseInt(value));
//			} else if (type.equalsIgnoreCase("value")) {
//				select.selectByValue(value);
//			}else if (type.equalsIgnoreCase("text")) {
//				select.selectByVisibleText(value);
//			}
//		} catch (Exception e) {
//			Assert.fail("ERROR: OCCURS DURING SELECT");
//		}
//    	
//
//	}
//    protected static void navigateTo(String uri) {
//       try {
//    	   driver.navigate().to(uri);
//		
//	} catch (Exception e) {
//       Assert.fail("ERROR:OCCURS DURING NAVIGATE");
//	}
//	}
//    protected static void send_input(WebElement element,String input) {
//           try {
//			element.sendKeys(input);
//		} catch (Exception e) {
//			Assert.fail("");
//			
//		}
//	}
//    
//}
