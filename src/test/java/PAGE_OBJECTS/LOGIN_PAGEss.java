package PAGE_OBJECTS;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UTILS.WAIT_HELPER;

public class LOGIN_PAGEss {

	public  WebDriver driver;
	public WAIT_HELPER WAIT_HELP;
	
	public LOGIN_PAGEss(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements(driver, this);
		WAIT_HELP=new WAIT_HELPER(driver);
	}
	@FindBy(xpath="//*[text()='Customer Login']")
	@CacheLookup
	WebElement txtCustomer_login;
	
	@FindBy(xpath="//*[@name='userSelect']")
	@CacheLookup
	WebElement txtselect;
	
	@FindBy(xpath="//*[@class='btn btn-default']")
	@CacheLookup
	WebElement txtlogin;
	
	@FindBy(xpath="(//*[@class='center']/descendant::button)[2]")
	@CacheLookup
	WebElement deposit_button;
	
	@FindBy(xpath="//*[@ng-model='amount']")
	@CacheLookup
	WebElement deposit_amount;
	
	@FindBy(xpath="//*[text()='Deposit']")
	@CacheLookup
	WebElement deposit_Final_button;
	
	@FindBy(xpath="//*[text()='Deposit Successful']")
	@CacheLookup
	WebElement deposit_Title;
	
	
	@FindBy(xpath="//*[text()='Home']")
	@CacheLookup
	WebElement Home_button;
	
	
	public void select_customerPage()
	{
		WAIT_HELP.Wait_For_Element(txtCustomer_login,Duration.ofSeconds(900));
		WAIT_HELP.Wait_For_Element(txtCustomer_login,Duration.ofSeconds(900));
		txtCustomer_login.click();
		
	}
	

	public void selectbyvalue_Method(String selectbytext)
	{
		WAIT_HELP.Wait_For_Element(txtselect,Duration.ofSeconds(900));
		WAIT_HELP.Wait_For_Element(txtselect,Duration.ofSeconds(900));
		Select objSelect = new Select(txtselect);
		objSelect.selectByVisibleText(selectbytext);
		WAIT_HELP.Wait_For_Element(txtselect,Duration.ofSeconds(900));
		
		
		
	}
	   public void check_customerlogin()
		{
		   
		   
		   WAIT_HELP.Fluent_wait(txtlogin, Duration.ofSeconds(900));
		   WAIT_HELP.Wait_For_Element(txtlogin,Duration.ofSeconds(900));
		   txtlogin.click();
		  WAIT_HELP.implict_wait();
		}
		
	
	   public void deposit_Button()
		{
		 
		   
		  
		   WAIT_HELP.Wait_For_Element(deposit_button,Duration.ofSeconds(900)); 
		   WAIT_HELP.Fluent_wait(deposit_button, Duration.ofSeconds(900));
		     WAIT_HELP.implict_wait();
		     deposit_button.click();
			
		}
	   public void check_customerlogins(Integer value)
		{
		 
		   WAIT_HELP.Fluent_wait(deposit_amount, Duration.ofSeconds(900));
		   WAIT_HELP.Wait_For_Element(deposit_amount,Duration.ofSeconds(900));
		   WAIT_HELP.implict_wait();
		   String k=String.valueOf(value);
		   deposit_amount.sendKeys(k);
		  
		   
			
		}
	   public void deposit_Final_button()
		{
			 
		 
		  
		   WAIT_HELP.Wait_For_Element(deposit_Final_button,Duration.ofSeconds(900));
		   WAIT_HELP.Wait_For_Element(deposit_Final_button,Duration.ofSeconds(700));
		   deposit_Final_button.click();
		   //WAIT_HELP.implict_wait();
			
		}
	   public String  Title()
		{
		   String test=deposit_Title.getText();
		   
			return test ;
		  
			
		}
	   public void Home_Button()
	   {
		   
		   WAIT_HELP.Fluent_wait(Home_button, Duration.ofSeconds(900));
		   WAIT_HELP.Wait_For_Element(Home_button,Duration.ofSeconds(700));
		   Home_button.click();
			
		   //WAIT_HELP.implict_wait();
	   }
	   
	   public String Title1()
	   {
		   return driver.getTitle();
		   
		   
	   }
	   
	  public void confirmation_messsages()
	  {
		  Assert.assertTrue(driver.findElement(By.tagName("body"))
				  
				 .getText().contains("Protractor practice website - Banking App"));
	  }
	
	  
		
}
