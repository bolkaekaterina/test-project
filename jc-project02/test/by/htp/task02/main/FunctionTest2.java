package by.htp.task02.main;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest2 {
	
	@Test
	public void firstNumberNegativeTest() {
		int[] arr = { -8, 3, -6, 7, 8, 0, 9, 0 };
		boolean actualNegative;
		boolean expectedNegative = false;
		actualNegative = Function.isFirstNumberInArrayPositive(arr);
		Assert.assertEquals("Произошла ужасная ошибка!", expectedNegative, actualNegative);
	}
}
 