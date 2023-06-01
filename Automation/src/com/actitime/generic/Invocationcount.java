package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount=5)
	public void demo() {
		Reporter.log("welcome",true);
	}


}
