package com.Defaultselenium;

public class FirefoxD implements WebDriver {

	@Override
	public void clicking(String locator) {
		System.out.println("Clicked on the element in ff  " +locator);
	}

	@Override
	public void sendK(String locator, String value) {
		System.out.println("locator is :" +locator +"value is: " +value);	
	}


	

}
