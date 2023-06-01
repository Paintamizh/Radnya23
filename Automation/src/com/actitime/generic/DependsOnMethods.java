package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test
	public void createCustomer() {
		Reporter.log("its creating and independent");
	}
	@Test(dependsOnMethods="createCustomer")
	public void modifyCustomer() {
		Reporter.log("its modifying and dependent");
	}
	@Test(dependsOnMethods="createCustomer")
	public void deleteCustomer() {
		Reporter.log("its deleting and dependent");
	}
}
