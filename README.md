# Selenium
Selenium TestScripts
package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Imageclick {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		//updating the third time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='gwcswA']/div[2]/div[2]/div/table/tbody/tr/td/map/area")).click();
		driver.quit();
		
	}

}
