package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class Base_Class {
	
	public static WebDriver driver;
	
	protected static WebDriver launchBrowser( String browsername) {
		
		try {
			if( browsername.equalsIgnoreCase("chrome") ) {
				driver = new ChromeDriver();
			}
			else if ( browsername.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			else if ( browsername.equalsIgnoreCase("firefox") ) {
				driver = new FirefoxDriver();
			}	
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING BROWSER LAUNCH ");		
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	protected static void launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			
			Assert.fail("ERROR : OCCURS DURING URL PASSING ");
		}
	}
	
	protected static void quitBrowser() {
		try {
			driver.quit();
		}
		catch(Exception e ){
			Assert.fail("ERROR : OCCURS DURING BROWSER QUITING ");
		}
	}
	
	protected static void CloseBrowser() {
		try {
			driver.close();
		}
		catch(Exception e ){
			Assert.fail("ERROR : OCCURS DURING BROWSER CLOSING ");
		}
	}
	
	protected static void sendInput(WebElement element ,String input ) {
		try {
			element.sendKeys(input);
		}
		catch(Exception e ){
			Assert.fail("ERROR : OCCURS DURING SEND INPUT ");
		}
	}
	
	protected static void click( WebElement element ) {
		try {
			element.click();	
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING CLICKING ");		}
	}
	
	protected static void select(WebElement element , String type , String value ) {
		
		try {
			Select select = new Select(element);
			if( type.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(value));
			}
			else if (type.equalsIgnoreCase("value")) {
				select.selectByValue(value);
			}
			else if (type.equalsIgnoreCase("text")) {
				select.selectByVisibleText(value);
			}
			
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING SELECTING ");
		}
	}
	
	protected static void deSelect(WebElement element , String type , String value ) {
		
		try {
			Select deselect = new Select(element);
			if( type.equalsIgnoreCase("index")) {
				deselect.deselectByIndex(Integer.parseInt(value));
			}
			else if (type.equalsIgnoreCase("value")) {
				deselect.deselectByValue(value);
			}
			else if (type.equalsIgnoreCase("text")) {
				deselect.deselectByVisibleText(value);
			}
			
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING DESELECTING ");
		}
	}
	
	protected static void windowHandles(int num) {
		
		try {
			List<String> allWindow = new ArrayList(driver.getWindowHandles());
			driver.switchTo().window(allWindow.get(num));
			
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURS DURING SWITCHING TAB ");
		}
		
	}
	
	protected static void navigateTo( String url ) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURS DURING NAVINGATING TO URL ");
		}
	}
	
	protected static void navigation( String type ) {
		try {
			switch(type.toLowerCase()) {
			case "back":
				driver.navigate().back();
				break;
			case "forward":
				driver.navigate().forward();
				break;
			case "refresh":
				driver.navigate().refresh();
				break;
			default :
				Assert.fail("ERROR: OCCURS DURING NAVINGATION " + type);
			}	
		}
		catch (Exception e) {
			Assert.fail("ERROR: OCCURS DURING NAVINGATION ");
		}
	}
	
	protected static void alertAction ( String action ) {
		try {
			Alert alert = driver.switchTo().alert();
			if( action.equalsIgnoreCase("accept")) {
				alert.accept();
			}else if ( action.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}else if (action.equalsIgnoreCase("gettext")) {
				System.out.println(alert.getText());
			}
			
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURS DURING ALERT ACTION ");
		}
	}
	
	protected static void inputAlert( String input , String action ) {
		try { 
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(input);
			
			if(action.equalsIgnoreCase("accept")) {
				alert.accept();
			}
			else if( action.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			}
			
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURS DURING INPUT TO ALERT ");
		}
	}
	
	protected static void waitImplicitly( int s) {
		try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));}
		catch(Exception e) {
			Assert.fail("ERROR: OCCURS DURING IMPLICIT WAIT EXECUTION ");
		}
	}
	
	protected static void waitExplicitly(int s , WebElement element , String action) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(s));
				if( action.equalsIgnoreCase("clickable")) {
					wait.until(ExpectedConditions.elementToBeClickable(element)); 
				}
				else if ( action.equalsIgnoreCase("visibile")) {
					wait.until(ExpectedConditions.visibilityOf(element));
				}
			
		}
		catch(Exception e) {
				Assert.fail("ERROR: OCCURS DURING EXPLICIT WAIT EXECUTION ");
			}
		
	}
	
	protected static void captureScreenshot( String filename ) throws IOException {
		
		try{
		Date currentDate = new Date();
		String dateText = currentDate.toString().replace(" ", "_").replace(":","_");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(".//Screenshots//" +filename+ dateText + ".png"));}
		catch (Exception e){
			Assert.fail("ERROR: OCCURS DURING CAPTURE SCREENSHOT ");
		}
		
	}
	
	protected static String get( String action ) {
		
		try {
			if	( action.equalsIgnoreCase("get_title")) {
				return driver.getTitle();	}	
			else if	( action.equalsIgnoreCase("get_current_url")) {
				return driver.getCurrentUrl();
			}	
		}
		catch(Exception e){
			Assert.fail("ERROR: OCCURS DURING GET ");
		}
		
		return null;
	}
	
	protected static String getText( WebElement element) {
		try{
			System.out.println(element.getText());
		}
			catch (Exception e){
				Assert.fail("ERROR: OCCURS DURING GETTING TEXT ");
			}
		return null;
	}
	
	protected static void switchToFrame( String id , String type ) {
		try {
			if( type.equalsIgnoreCase("index")) {
				driver.switchTo().frame(Integer.parseInt(id)); }
			else if ( type.equalsIgnoreCase("name")) {
				driver.switchTo().frame(id);
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURS DURING SWTICH TO FRAME ");
		}
	}
	
	protected static boolean isFunction ( WebElement element , String type ) {
		try {
			if( type.equalsIgnoreCase("displayed") ) {
				return element.isDisplayed();}
			else if( type.equalsIgnoreCase("enabled") ) {
				return element.isEnabled();
			} else if( type.equalsIgnoreCase("selected") ) {
				return element.isSelected();
			}
		} catch (Exception e) {
			Assert.fail("ERROR: OCCURS DURING ISFUNCTION ");
		}
		return false;
	}
	
	protected static void scrollUsingJs(int x , int y) {
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy( " + x +"," + y +")");
		}
		catch(Exception e) {
			Assert.fail("ERROR: OCCURS DURING ISFUNCTION");
		}
	}	
		
	protected static void scrollUsingWebElement( WebElement element , String scrollType) {
		
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			if( scrollType.equalsIgnoreCase("scrollIntoView")) {
				js.executeScript("arguments[0].scrollIntoView(true);", element ); }
			
			else if ( scrollType.equalsIgnoreCase("scrollAndClick") ) {
				js.executeScript("arguments[0].scrollIntoView(true);", element);
				js.executeScript("arguments[0].click();", element);
			}
			else {
	            Assert.fail("ERROR: INVALID SCROLL TYPE - " + scrollType);
	        }
			
		}catch( Exception e ) {
			Assert.fail("ERROR: OCCURS DURING SCROLL USING WEBELEMENT ");
		}
	}
	
	protected static void scrollAndSendKeysById(String idValue  , String textValue ) {
			try {
			JavascriptExecutor js =  (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('" + idValue +"').value = '" + textValue +"' " );
			}
			catch(Exception e ) {
				Assert.fail("ERROR: OCCURS DURING SCROLL USING SCROLL AND SEND KEYS BY ID");
				
				
				
			}
	}
	
	
	
	
			
	
	
	
	
	
	
		
	}
