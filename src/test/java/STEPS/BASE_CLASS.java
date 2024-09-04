package STEPS;







import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PAGE_OBJECTS.ADD_CUSTOMERPAGE;
import PAGE_OBJECTS.LOGIN_PAGEss;
import UTILS.WAIT_HELPER;


public class BASE_CLASS {

	
	public WebDriver driver;
	public  LOGIN_PAGEss lp;
	public ADD_CUSTOMERPAGE mp;
	
	public static Logger logger ;
	
	public Properties config;
	
	
	public static String RandomString()
	{
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		String generatedString2=generatedString1+"@gmail.com";
		
		System.out.println("Enter the Random Email Address are ="+generatedString2);
		
		return (generatedString2);
		
	}
}
