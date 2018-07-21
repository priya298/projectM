package com.ecommerce.PageUI;
import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ecommerce.BasePage.BasePage;


public class CustomerRegistration extends BasePage
{
	
	public static final Logger log=Logger.getLogger(CustomerRegistration.class.getName());
	
	
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email_create") WebElement mailid;
	@FindBy(id="SubmitCreate") WebElement submit;
	@FindBy(xpath="//h1[text()='Create an account']") WebElement verify;
	@FindBy(id="id_gender2") WebElement mrs;
	@FindBy(id="customer_firstname") WebElement firstname;
	@FindBy(id="customer_lastname") WebElement lastname;
	@FindBy(id="passwd") WebElement password;
	@FindBy(id="days")WebElement date;
	@FindBy(id="months") WebElement month;
	@FindBy(id="years") WebElement year;
	@FindBy(id="address1") WebElement address;
	@FindBy(id="city")WebElement city;
	@FindBy(id="id_state") WebElement state;
	@FindBy( id="postcode") WebElement pincode;
	@FindBy(id="id_country")WebElement country;
	@FindBy(id="phone_mobile") WebElement mobile;
	@FindBy(id="submitAccount") WebElement register;
	@FindBy(xpath="//h1[text()='My account']") WebElement myaccount;
	
  public CustomerRegistration()
	{
		PageFactory.initElements(driver, this);
	}



	public  void CustermerRegistration()
	{
		try {
			signIn.click();
			mailid.sendKeys(getData("firstname")+getData("lastname")+randomNumber()+getData("domainname"));
			submit.click();
			Thread.sleep(5000);
			//Assert.assertTrue(verify.getText().equalsIgnoreCase("Create an account"));
			mrs.click();
			firstname.sendKeys("vishnu");
			lastname.sendKeys("priya");
			password.sendKeys("priyam298");
			selectOption(date,3);
			selectOption(month, 3);
			selectOption(year,2);
			address.sendKeys("miyapur");
			city.sendKeys("Hyderabab");
			state.sendKeys("telangana");
			pincode.sendKeys("50005");
			country.sendKeys("India");
			mobile.sendKeys("9491997048");
			register.click();
			Assert.assertTrue(myaccount.getText().equalsIgnoreCase("My account"));
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	}



	

	
