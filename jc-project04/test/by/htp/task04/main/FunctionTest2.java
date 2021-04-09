package by.htp.task04.main;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest2 {
	@Test
	public void calcSubctract() {

		ComplexNumber number1 = new ComplexNumber(3.0, 7.0);
		ComplexNumber number2 = new ComplexNumber(8.0, 3.0);
		ComplexLogic logic = new ComplexLogic();

		ComplexNumber expectedSubctract = new ComplexNumber(-5.0, 4.0);
		ComplexNumber actualSubctract = logic.substract(number1, number2);

		Assert.assertEquals(expectedSubctract, actualSubctract);

	}
}
