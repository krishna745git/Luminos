package com.flipkart.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.demo.Baseclass;




public  class LoginPOM extends Baseclass {
	
	
	
	
	 public LoginPOM() {
     	PageFactory.initElements(driver, this);
     }
	 
	 public WebElement getEnterfirstname() {
		return Enterfirstname;
	}


	public WebElement getEnterlasttname() {
		return Enterlasttname;
	}


	public WebElement getEnteremail() {
		return Enteremail;
	}


	public WebElement getEnterconfirmemail() {
		return Enterconfirmemail;
	}


	public WebElement getEnterpassword() {
		return Enterpassword;
	}


	public WebElement getEnterconfirmpassword() {
		return Enterconfirmpassword;
	}


	public WebElement getCreated() {
		return Created;
	}

	@FindBy(xpath="//*[@id=\"dwfrm_profile_customer_firstname\"]")
	 public WebElement Enterfirstname;
	
	 @FindBy(xpath="//*[@id=\"dwfrm_profile_customer_lastname\"]")
	 public WebElement Enterlasttname;
	

	 @FindBy(xpath="//*[@id=\"dwfrm_profile_customer_email\"]")
	 public WebElement Enteremail;
	 

	 @FindBy(xpath="//*[@id=\"dwfrm_profile_customer_emailconfirm\"]")
	 public WebElement Enterconfirmemail;
	 

	 @FindBy(xpath="//*[@id=\"dwfrm_profile_login_password\"]")
	 public WebElement Enterpassword;
	 
	 @FindBy(xpath="//*[@id=\"dwfrm_profile_login_passwordconfirm\"]")
	 public WebElement Enterconfirmpassword;


	@FindBy(xpath="//*[@id=\"RegistrationForm\"]/fieldset/div[4]/button/span")
	public WebElement Created;
	
	
    public WebElement getWriteemail() {
		return Writeemail;
	}

	public WebElement getWritepassword() {
		return Writepassword;
	}

	public WebElement getPresslogin() {
		return Presslogin;
	}

	@FindBy(xpath="//input[@id='dwfrm_login_username']")
    public WebElement Writeemail;
    
    @FindBy(xpath="//*[@id=\"dwfrm_login_password\"]")
    public WebElement Writepassword;
    
    @FindBy(xpath="//*[@id=\"dwfrm_login\"]/fieldset/div[3]/div[2]/button/span")
    public WebElement Presslogin;
    
    public WebElement getLive() {
		return live;
	}

	public WebElement getEnteryourname() {
		return Enteryourname;
	}

	public WebElement getEnteryouremail() {
		return Enteryouremail;
	}

	public WebElement getSubmi() {
		return submi;
	}

	@FindBy(xpath="/html[1]/body[1]/div[4]/div[2]/header[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]")
    public WebElement live;
    
    
    @FindBy(xpath="//*[@id=\"txt_4616424\"]")
    public WebElement Enteryourname;
    
    
    @FindBy(xpath="//*[@id=\"txt_4616425\"]")
    public WebElement Enteryouremail;
    
    
   @FindBy(xpath="/html[1]/body[1]/div[31]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/button[4]")
   public WebElement submi;
   
   public WebElement getClosePopup() {
	return closePopup;
}

   @FindBy(xpath = "//*[@id=\"ltkpopup-close-button\"]/a")
   public  WebElement closePopup;
	 
	 
        
     public void createAccount() {
    	 
    	 
    	 Enterfirstname.sendKeys(prop.getProperty("firstName"));
    	 
    	 Enterlasttname.sendKeys(prop.getProperty("lastName"));
    	 
    	 Enteremail.sendKeys(prop.getProperty("email"));
    	 
    	 Enterconfirmemail.sendKeys(prop.getProperty("password"));
    	 
    	 Enterpassword.sendKeys(prop.getProperty("firstName"));
    	 
    	 Enterconfirmpassword.sendKeys(prop.getProperty("confirmPassword"));
    	 
    	 Created.click();
     }

	
	}
	




