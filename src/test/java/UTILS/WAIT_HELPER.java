package UTILS;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WAIT_HELPER {
	
	public WebDriver driver;
	 public WAIT_HELPER(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 public void Wait_For_Element(WebElement element ,Duration timeOutInSeconds)
	 {
		 WebDriverWait waits =new WebDriverWait(driver, timeOutInSeconds);
		 waits.until(ExpectedConditions.visibilityOf(element));
				 
	 }

	 public void Fluent_wait(WebElement element ,Duration timeOutInSeconds)
	 {
		 Wait<WebDriver> Fluent_waits = new FluentWait<WebDriver>(driver)
			        .withTimeout(Duration.ofSeconds(30))
			        .pollingEvery(Duration.ofSeconds(5))
			        .ignoring(NoSuchElementException.class);
		 
				 Fluent_waits.until(ExpectedConditions.visibilityOf(element));
		 
	 }
	 public void implict_wait()
	 {

        driver.manage().timeouts().implicitlyWait(Duration.ofHours(2));
	 }
}
