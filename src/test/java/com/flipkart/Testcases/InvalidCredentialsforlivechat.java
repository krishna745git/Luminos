package com.flipkart.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.demo.Baseclass;
import com.flipkart.pageobjects.LoginPOM;

public class InvalidCredentialsforlivechat extends Baseclass {
	
	
	
	
	
	
	
	
	

	@BeforeTest
	public void btest() throws IOException, InterruptedException {
		
		Launchbrowser() ;
		geturl();
		max();	
		
		Tittle();
		
		Thread.sleep(5000);
		clearrpop();
	//	Mouseover();
	}
	
	    @Test
     	public void Login() throws Exception {
	    	
	    	LoginPOM l3=new LoginPOM();
	    	
	    	Thread.sleep(0);
	    	
	    	l3.getLive().click();
	    	
	    	Thread.sleep(5000);
	    	
	    	l3.getEnteryourname().sendKeys(" krishna kanth ");
	    	l3.getEnteryouremail().sendKeys("krishna@gmail.com");
	    	l3.getSubmi().click();
	    	
	}



}
