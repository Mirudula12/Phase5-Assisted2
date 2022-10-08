
package com.example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	WebDriver wd;
	@Parameters("browser")
@BeforeTest
public void config(String browser) {
	switch(browser) {
	case "chrome":WebDriverManager.chromedriver().setup();
	wd=new ChromeDriver();
	break;
	case "firefox":	WebDriverManager.firefoxdriver().setup();
	wd=new FirefoxDriver();
	break;
	
	}
	wd.manage().window().maximize();
	
	
}

@AfterTest
public void quitbrowser() {
	wd.quit();
}
	
	//"https://www.google.com/?gws_rd=ssl"
@Parameters("url1")
  @Test
  public void test1(String url1) {
  wd.get(url1);
  }
  
 //"https://www.amazon.in/"
@Parameters("url2")
  @Test
  public void test2(String url2) {
	  wd.get(url2);
  }
}
