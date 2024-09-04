package STEPS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PAGE_OBJECTS.ADD_CUSTOMERPAGE;
import PAGE_OBJECTS.LOGIN_PAGEss;
import UTILS.WAIT_HELPER;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class STEPS extends BASE_CLASS
{

	public WAIT_HELPER WAIT_HELP;
	
	@Before
	public void setup() throws IOException
	{
		config=new Properties();
		FileInputStream config_prop=new FileInputStream("CONFIG.properties");
		config.load(config_prop);
		String br=config.getProperty("browser");
		if(br.equals("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver",config.getProperty("chromepath"));
			driver =new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofHours(5));
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver",config.getProperty("geckodriverpath"));
			driver =new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofHours(5));
		}
		else if(br.equals("ie"))
		{
			System.setProperty("Webdriver.edge.driver",config.getProperty("ie_driverpath"));
			driver =new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofHours(5));
		}
		
				
		logger= Logger.getLogger(STEPS.class);
		
		PropertyConfigurator.configure("LOG4J.properties");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		WAIT_HELP=new WAIT_HELPER(driver);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		logger.info("********LaunchingBrowserSSssS*********");
		
		
	}
	
	
@Given("User launch the browser")
public void user_launch_the_browser()  {
	
	
	lp=new LOGIN_PAGEss(driver);
	
	
}

@When("User open the URL {string}")
public void user_open_the_url(String URL) throws InterruptedException {
	driver.get(URL);
	logger.info("********open the URL*********");

}



@When("User select customer login")
public void user_select_customer_login() throws InterruptedException {
   
	lp.select_customerPage();
	logger.info("********user_select_customer_login*********");
}

@When("User Select the  Name such as {string}")
public void user_select_the_name_such_as(String text) throws InterruptedException {
    
	lp.selectbyvalue_Method(text);
	logger.info("********user_select_the_name_*********");
	
}

@When("User click the Deposit   button")
public void user_click_the_deposit_button() throws InterruptedException {
	lp.check_customerlogin();
	logger.info("********user_click_the_deposit_button********");
	
}


@When("User enter  amount that need to be Deposited as {int}")
public void user_enter_amount_that_need_to_be_deposited_as(Integer value1) throws InterruptedException {

	lp.deposit_Button();
	logger.info("********user_enter_amount_that_need_to_be_deposited********");
	
	lp.check_customerlogins(value1);
	logger.info("********check_customerloginsr********");
}

@When("User click Deposit button")
public void user_click_deposit_button() throws InterruptedException {
    
	lp.deposit_Final_button();
	logger.info("********User click Deposit button*******");
}

@Then("user validate amount is  deposited or not")
public void user_validate_amount_is_deposited_or_not() {

      String Actualvalue=lp.Title();
      String Expectedvalue="Deposit Successful";
      Assert.assertEquals(Actualvalue,Expectedvalue);
      logger.info("********user_validate_amount********");
}

@When("User Navigate to Home login Page")
public void user_navigate_to_home_login_page() {
	lp.Home_Button();
	logger.info("********user_navigate_to_home_login_pager********");
}
@Then("Page Title should be  {string}")
public void page_title_should_be(String string) {
	
	logger.info("********page_title********");
	  String Tittle1=driver.getTitle();
	  System.out.println("The title of page is "+Tittle1);
	  
}

@Then("close Browser")
public void close_browser() throws InterruptedException {
	
	
	 logger.info("********closingBrowser********");
     
	 driver.close();
	 
	 driver.quit();
	 
	 
	
 

 
}
// Feature File 2
/***********************************************
 * Method Name	: Feature File 2
 * purpose	  	: 
 * Author	  	: Gulnar P
 * Reviewer	  	: 
 * Date created	: 
 * Date Modified: 
 * *********************************************
 */

@When("User click BankManager login")
public void user_click_bank_manager_login() throws InterruptedException {
 
	
	WAIT_HELP.implict_wait();
	
	mp=new ADD_CUSTOMERPAGE(driver);
	mp.Select_Roles("Bank_Manager_Login");
	logger.info("********user_click_bank_manager_login********");
	WAIT_HELP.implict_wait();

	
	mp.click_Navigate_Customer();
	logger.info("********click_Navigate_Customer********");
}

@When("User  Enter the {string},{string},{string}")
public void user_enter_the(String FirstName, String LastName,String PostCode) throws InterruptedException {
	
	
   mp.set_FirstName(FirstName);
   
   mp.set_LastName(LastName);
 
   mp.set_PostCode(PostCode);
   logger.info("********user_enter_theFirst,LastName&Postal*********");
   
	}
   


@When("User click Add Customer button")
public void user_click_add_customer_button() throws InterruptedException {
   mp.click_Customer_button();

   mp. Handle_alert();
   logger.info("********user_click_add_customer_button********");
}

@Then("User Navigate to Open Account")
public void user_navigate_to_open_account() throws InterruptedException {
	
	
	mp.click_Navigate_OpenAccount();
	logger.info("********user_navigate_to_open_account********");
}

@Then("User Enter the {string} &{string}")
public void user_enter_the(String CustomerName,String currency) throws InterruptedException {
	
	
	mp.Select_CustomerName(CustomerName);
	logger.info("********user_enter_theCustomerName********");
	mp.Select_Currency(currency);
	
	logger.info("********user_enter_thecurrency********");
}

@Then("User click Process button")
public void user_click_process_button() throws InterruptedException {
   
	mp.click_Process_btn();
	logger.info("********user_click_process_button********");
	mp.Handle_alert();
	logger.info("********user_click_Alert_button********");
}

@Then("User navigate to customer Page")
public void user_navigate_to_customer_page() throws InterruptedException {
   
	mp.click_Navigate_customer_page();
	
	logger.info("********user_navigate_to_customer_page********");
	RandomString();
}





}