package com.flipkart.Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.demo.Baseclass;
import com.flipkart.pageobjects.LoginPOM;

import Utility.Library;





   



public class Login extends Baseclass {
	
	
	/*public Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
*/
	
	
	@BeforeTest
	public void btest() throws IOException, InterruptedException {
		
		Launchbrowser() ;
		geturl();
		max();	
		Thread.sleep(5000);
		clearrpop();
		
		Mouseover();
	}
	
	
	    @Test ( priority = 0 )
     	public void Login() throws Exception {
	    	
	    	LoginPOM l=new LoginPOM();
	    	
	    	Library take=new Library();
	    	
	    	
	    	
	    //	l.getClosePopup().click();
	    	
	    	l.getEnterfirstname().sendKeys("krishna");
	    	
	    	take.capturescreenshot(driver);
	    	Thread.sleep(5000);
	    	l.getEnterlasttname().sendKeys("kanth");
	    	l.getEnteremail().sendKeys("krishna123@gmail.com");
	    	l.getEnterconfirmemail().sendKeys("krishna123@gmail.com");
	    	l.getEnterpassword().sendKeys("Kkanth745");
	    	l.getEnterconfirmpassword().sendKeys("Kkanth745");
	    	l.getCreated().click();
	    }
	    	
	    	   @Test ( priority = 1)
	    	 	public void Loginapp() throws Exception {
	    	    	
	    	    	LoginPOM l1=new LoginPOM();
	    	    	
	    	    	Library take1=new Library();
	    	    	
	    	    	
	    	    	l1.getWriteemail().sendKeys("krishna123@gmail.com");
	    	    	
	    	    	take1.capturescreenshot(driver);
	    	    	Thread.sleep(5000);
	    	    	l1.getWritepassword().sendKeys("Kkanth745");
	    	    	l1.Presslogin.click();
	    	    	
	    	    	
	    	    	
	    	
	    	
	        
	    	
	
	    	   }
	

}
