package PAGE_OBJECTS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testing {
	public WebDriver driver;
	public  LOGIN_PAGEss lp;
	
	@Test
	public void method3() throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"//DRIVER/chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(3000);
		lp=new LOGIN_PAGEss(driver);
		
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		Thread.sleep(2000);
		
		lp.select_customerPage();
		Thread.sleep(2000);
		
		
		
		//Select objSelect = new Select(driver.findElement(By.id("userSelect")));
       
		Select objSelect = new Select(driver.findElement(By.xpath("//*[@name='userSelect']")));
		objSelect.selectByVisibleText("Hermoine Granger");
	}
	

}
