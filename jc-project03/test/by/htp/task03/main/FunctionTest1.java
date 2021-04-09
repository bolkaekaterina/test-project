package by.htp.task03.main;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest1 {
	@Test
	public void calcSum() {
		
		int[][] arr =   {{7, -5, 7, 9, 8 }, 
						{ 7, 8, -5, 8, 5 }, 
						{ 2, 5,  7, 6, 8 }, 
						{ 5, -8, 3, 7, 3},
						{ 3,  5, 8, 7, 3}};

		int actualSum;
		int expectedSum = 13;

		actualSum = Function.getOddNegativeSum(arr);

		Assert.assertEquals(expectedSum, actualSum, 0.00000001);

	}
}
