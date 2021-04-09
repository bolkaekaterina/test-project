package by.htp.task01.main;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest2 {
	@Test
	public void calcCircleArea() {

		double r = 2.2;
		double actualArea;
		double expectedArea = 15.20530844337458;

		actualArea = Function.circleArea(r);

		Assert.assertEquals(expectedArea, actualArea, 0.00000001);
	}
}
