package com.Seleniumlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myntra {
	public static void main(String[] args) 
	{	
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://myntra.com/");
d.manage().window().maximize();
//d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//String CURL = d.getCurrentUrl();
//System.out.println(CURL);
System.out.println(d.getCurrentUrl());
System.out.println(d.getTitle());
System.out.println(d.getPageSource());

d.close();
}
}
