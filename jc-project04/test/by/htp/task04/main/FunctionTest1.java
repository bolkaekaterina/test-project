package by.htp.task04.main;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest1 {
	@Test
	public void calcSum() {

		ComplexNumber number1 = new ComplexNumber(4.0, 8.0);
		ComplexNumber number2 = new ComplexNumber(9.0, 4.0);

		ComplexLogic logic = new ComplexLogic();

		ComplexNumber expectedSum = new ComplexNumber(13.0, 12.0);
		ComplexNumber actualSum = logic.sum(number1, number2);

		Assert.assertEquals(expectedSum, actualSum);

	}
}
