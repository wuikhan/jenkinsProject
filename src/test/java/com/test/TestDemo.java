package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo {
	@Test(description="Google Home")
	public void testNew() {
		System.setProperty("phantomjs.binary.path", "/Users/waqaskhan/Downloads/phantomjs/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
		
		String title = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		
		
		
	}
}
