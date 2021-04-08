package com.flipkart.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.demo.Baseclass;
import com.flipkart.pageobjects.LoginPOM;

import Utility.Library;







public class Loginlumminos extends Baseclass {
	
	
	
	@BeforeTest
	public void btest() throws IOException, InterruptedException {
		
		Launchbrowser() ;
		geturl();
		
		max();	
		
		Thread.sleep(5000);
		
		clearrpop();
		
		Mouseover1();
		
		
		
		
	}

    @Test
 	public void Login() throws Exception {
    	
    	LoginPOM l1=new LoginPOM();
    	
    	Library take1=new Library();
    	
    	Thread.sleep(5000);
    	
    	
    	l1.getWriteemail().sendKeys("krishna123@gmail.com");
    	
    	take1.capturescreenshot(driver);
    	Thread.sleep(5000);
    	l1.getWritepassword().sendKeys("Kkanth745");
    	l1.Presslogin.click();
    	
    	
    	
    	
    	

}
}
