package com.Seleniumlearning;

import com.Defaultselenium.ChromeD;
import com.Defaultselenium.FirefoxD;
import com.Defaultselenium.InternetExplorerD;

public class Ownjar {

	public static void main(String[] args) {
	
		ChromeD cd = new ChromeD();
		FirefoxD ff = new FirefoxD();
		InternetExplorerD ied = new InternetExplorerD();
		
		cd.clicking("submit button");
		cd.sendK("text field ", "chrome");
		
		ff.clicking("submit button");
		ff.sendK("text field ", "ff");
		
		ied.clicking("submit button");
		ied.sendK("text field ", "ms");
	}

}
