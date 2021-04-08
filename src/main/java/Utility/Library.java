package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Library {
	
	
	
	
	
	
	
	
	
	 public static void capturescreenshot(WebDriver driver) throws Exception  {
	    	
	    	try {
				TakesScreenshot ts= (TakesScreenshot) driver;
				
				File sourse=ts.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(sourse, new File("C:\\Users\\bharath\\eclipse-workspace\\Maven\\Screenshots\\Luminos.png"));
				
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception while taking screenshot"+ e.getMessage());
		
	    }
	
	 }
}
	


