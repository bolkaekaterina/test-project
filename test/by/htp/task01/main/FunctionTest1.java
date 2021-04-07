package by.htp.task01.main;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest1 {

	@Test
	public void calcCircleLength() {
		
		double r = 2.1;
		double actualLength;
		double expectedLength = 13.19468914507712;
		
		actualLength = Functions.circleLength(r);
		
		Assert.assertEquals(expectedLength, actualLength, 0.00000001);
	}

}
