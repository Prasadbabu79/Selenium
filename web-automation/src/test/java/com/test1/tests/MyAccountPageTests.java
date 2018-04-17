package com.test1.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyAccountPageTests {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("baba");
	  driver.quit();
  }
}
