package com.Defaultselenium;

public class InternetExplorerD implements WebDriver {

	@Override
	public void clicking(String locator) {
		System.out.println("Clicked on the element in IDE" +locator);
	}

	@Override
	public void sendK(String locator, String value) {
		System.out.println("locator is :" +locator +"value is: " +value);	
	}

}
