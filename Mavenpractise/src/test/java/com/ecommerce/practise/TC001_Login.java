package com.ecommerce.practise;

import org.testng.annotations.Test;

import com.ecommerce.BasePage.BasePage;
import com.ecommerce.PageUI.CustomerRegistration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TC001_Login extends BasePage
{
	public static final Logger log=Logger.getLogger(TC001_Login.class.getName());
	WebDriver driver;
	
	CustomerRegistration register;
  
  
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception
  {
	 browserLaunch(browser,getData("ecommerceurl")); 
  }

  @Test
  public void f()
  {
	  log.info("=============Starting TC001_Login Test==============");
	  register=new CustomerRegistration();
	 
	  register.CustermerRegistration();
	  log.info("=============Ending TC001_Login Test============");
  }
  
  
  @AfterClass
  public void afterClass() 
  {
	  
  }

}
