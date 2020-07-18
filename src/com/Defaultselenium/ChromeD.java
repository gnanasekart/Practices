package com.Defaultselenium;

public class ChromeD implements WebDriver {
	
	
	@Override
	public void clicking(String locator) {
		System.out.println("Clicked on the element in chrome " +locator);
	}

	@Override
	public void sendK(String locator, String value) {
		System.out.println("locator is :" +locator +"value is: " +value);	
	}

}
