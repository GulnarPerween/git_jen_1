package PAGE_OBJECTS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UTILS.WAIT_HELPER;

public class ADD_CUSTOMERPAGE {

public  WebDriver Ldriver;
	
      public WAIT_HELPER WAIT_HELP;
	public ADD_CUSTOMERPAGE(WebDriver Rdriver)
	{
		Ldriver=Rdriver;
		PageFactory.initElements(Ldriver, this);
		WAIT_HELP=new WAIT_HELPER(Ldriver);
	}
	By Cusomter_Logins1=By.xpath("//*[text()='Customer Login']");
	
	By Bank_Manager_Logins=By.xpath("//*[text()='Bank Manager Login']");
	
	By Cutomer_Selections=By.xpath("//*[@ng-class='btnClass1']");
	
	By FirstName=By.xpath("(//*[@type='text'])[1]");
	By LastName=By.xpath("//*[@placeholder='Last Name']");
	By PostCode=By.xpath("//*[@placeholder='Post Code']");
	By Customer_button=By.xpath("//*[text()='Add Customer']");
	By Navigate_OpenAccount=By.xpath("//*[@ng-click='openAccount()']");
	
	By CustomerName =By.xpath("//*[@name='userSelect']");
	By CustomerCurrency =By.xpath("//*[@name='currency']");
	
	By Process_btn=By.xpath("//*[text()='Process']");
	
	By Navigate_customer_page=By.xpath("//*[@ng-click='showCust()']");
	
	By Delete_button1=By.xpath("(//*[text()='234567']/following::button)[1]");
	By Delete_button2=By.xpath("(//*[text()='234567']/following::button)[2]");
	
	public void click_Navigate_Customer()
	{
		WebElement a=Ldriver.findElement(Cutomer_Selections);
		WAIT_HELP.Fluent_wait(a, Duration.ofSeconds(700));
		WAIT_HELP.Wait_For_Element(a,Duration.ofSeconds(700));
		WAIT_HELP.Wait_For_Element(a,Duration.ofSeconds(900));
		
		a.click();
	}
	public void set_FirstName(String FirstNames)
	{
		WebElement b=Ldriver.findElement(FirstName);
		WAIT_HELP.Fluent_wait(b, Duration.ofSeconds(700));
		WAIT_HELP.Wait_For_Element(b,Duration.ofSeconds(700));
		WAIT_HELP.Wait_For_Element(b,Duration.ofSeconds(700));
	
		b.sendKeys(FirstNames);
	}
	
	public void set_LastName(String LastNames)
	{
		WebElement c=Ldriver.findElement(LastName);
		WAIT_HELP.Fluent_wait(c, Duration.ofSeconds(700));
		WAIT_HELP.Wait_For_Element(c,Duration.ofSeconds(700));
		
		 
		c.sendKeys(LastNames);
	}
	
	public void set_PostCode(String setPostCode)
	{
		WebElement d=Ldriver.findElement(PostCode);
				
		WAIT_HELP.Wait_For_Element(d,Duration.ofSeconds(700));
		WAIT_HELP.Wait_For_Element(d,Duration.ofMinutes(5));
		d.sendKeys(setPostCode);
	}
	
	public void click_Customer_button()
	{
		WebElement e=Ldriver.findElement(Customer_button);
				
		WAIT_HELP.Wait_For_Element(e,Duration.ofHours(2));
		WAIT_HELP.Wait_For_Element(e,Duration.ofSeconds(700));
		e.click();
	}
	
	public void click_Navigate_OpenAccount()
	{
		WebElement f=Ldriver.findElement(Navigate_OpenAccount);
				
		WAIT_HELP.Wait_For_Element(f,Duration.ofHours(2));
		WAIT_HELP.Wait_For_Element(f,Duration.ofMinutes(5));
		f.click();
	}
	public void Select_CustomerName(String selectbytexts)
	{
		WebElement g=Ldriver.findElement(CustomerName);
		
		WAIT_HELP.Wait_For_Element(g,Duration.ofHours(2));
		WAIT_HELP.Wait_For_Element(g,Duration.ofSeconds(700));
		Select objSelect = new Select(g);
		objSelect.selectByVisibleText(selectbytexts);
	}
	public void Select_Currency(String currency_value)
	{
	
		WebElement m=Ldriver.findElement(CustomerCurrency);
		WAIT_HELP.Wait_For_Element(m,Duration.ofHours(2));
		
		WAIT_HELP.Wait_For_Element(m,Duration.ofMinutes(5));
		
		Select objSelect = new Select(m);
		objSelect.selectByVisibleText(currency_value);
	}
	public void click_Process_btn()
	{
		WebElement t=Ldriver.findElement(Process_btn);
				
		WAIT_HELP.Wait_For_Element(t,Duration.ofHours(2));
		WAIT_HELP.Wait_For_Element(t,Duration.ofSeconds(700));
		t.click();
	}
	public void click_Navigate_customer_page()
	{
		WebElement p=Ldriver.findElement(Navigate_customer_page);
				
		WAIT_HELP.Wait_For_Element(p,Duration.ofHours(2));
		WAIT_HELP.Wait_For_Element(p,Duration.ofSeconds(700));
		p.click();
	}
	
	
	public void Handle_alert()
	{
		WAIT_HELP.implict_wait();
		Alert a=Ldriver.switchTo().alert();
		a.accept();
	}
	
	
	
	public void Select_Roles(String roles) throws InterruptedException
	{
		WebElement listitem;
		if(roles.equals("Bank_Manager_Login"))
		{
			listitem=Ldriver.findElement(Bank_Manager_Logins);
			WAIT_HELP.Wait_For_Element(listitem,Duration.ofHours(2));
			WAIT_HELP.Wait_For_Element(listitem,Duration.ofSeconds(700));
			listitem.click();
		}
		else if(roles.equals("Customer_roles"))
		{
			listitem=Ldriver.findElement(Cusomter_Logins1);
			WAIT_HELP.Wait_For_Element(listitem,Duration.ofHours(2));
			WAIT_HELP.Wait_For_Element(listitem,Duration.ofSeconds(700));
			listitem.click();
		}
	}
}
