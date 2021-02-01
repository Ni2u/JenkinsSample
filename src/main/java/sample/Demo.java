package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void sample() {
		Reporter.log("Hello", true);
	}
}
