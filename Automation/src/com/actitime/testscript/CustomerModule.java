package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule extends Baseclass1{
	@Test
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}

}
