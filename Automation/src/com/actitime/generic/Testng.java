package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng {
	@Test(priority=3)
	public void demo() {
		Reporter.log("welcome",true);
	}
@Test(priority=1)
		public void demo1() {
			Reporter.log("hai",true);
		}
	@Test(priority=2)
	public void demo2() {
		Reporter.log("bye",true);
	}
}



