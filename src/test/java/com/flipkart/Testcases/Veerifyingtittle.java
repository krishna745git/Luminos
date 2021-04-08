package com.flipkart.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.demo.Baseclass;
import com.flipkart.pageobjects.LoginPOM;

public class Veerifyingtittle extends Baseclass {
	
	

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
	    	
	    	LoginPOM l2=new LoginPOM();
	    	
	    	Thread.sleep(0);
	    	
	    	l2.getLive().click();
	    	
	    	Thread.sleep(5000);
	    	
	    	l2.getEnteryourname().sendKeys("krishna kanth");
	    	l2.getEnteryouremail().sendKeys("krishna123@gmail.com");
	    	l2.getSubmi().click();
	    	
	}

}
