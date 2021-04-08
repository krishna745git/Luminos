package com.flipkart.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.agent.builder.AgentBuilder.InstallationListener.NoOp;

public class Baseclass {
	
	
	public static WebDriver driver;
	
	public Properties prop;
	
	public void Launchbrowser() throws IOException {
		
		prop = new Properties();
		FileInputStream file;
		file=new FileInputStream("C:\\Users\\bharath\\eclipse-workspace\\Maven\\src\\main\\java\\com\\flipkart\\demo\\constant.properties");
		prop.load(file);
	
	    System.setProperty("webdriver.chrome.driver", "E:\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	public void geturl() {
		driver.get(prop.getProperty("url1"));
	}
	public void geturl1() {
		driver.get(prop.getProperty("url"));
	}
	
	
	public void max() {
		
		driver.manage().window().maximize();
	}
		
    public void clearrpop() {
    	driver.findElement(By.xpath("//a[@class='ltkpopup-close']")).click();
    }
   

	
	public void Tittle() {
		
		  String Actual = driver.getTitle();
	        String Expected = "Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com";

	        if (Actual.equals(Expected)) {
	                   System.out.println("Test Passed!");
	        } else {
	                   System.out.println("Test Failed");
	        }
	}
	
	public void Mouseover() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/span"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(5000);
		
		act.moveToElement(ele).perform();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id=\"my_account_hdr_link\"]")).click();
	}
	
		public void Mouseover1() throws InterruptedException {
			
			
			WebElement ele=driver.findElement(By.xpath("//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/button/span"));
			
			Actions act=new Actions(driver);
			
			Thread.sleep(5000);
			
			act.moveToElement(ele).perform();
			
			Thread.sleep(5000);
			
			driver.findElement(By.linkText("Sign In")).click();
			//driver.findElement(By.xpath("//*[@id=\"header-wrapper\"]/header/div[2]/div[4]/ul/li[2]/div/div/div/a")).click();
			
			
		
		
	
			
		}
	

            
      
	
}
	
/*	public void getUserName() {
		driver.get(prop.getProperty("username"));
	}

	public void getPassword() {
		driver.get(prop.getProperty("password"));
	}
	*/


