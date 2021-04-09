package by.htp.task03.main;

public class Function {

	public static int getOddNegativeSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if ((i % 2 != 0) && ((arr[i][j] < 0))) {
					sum = sum + arr[i][j];
				}
			}
		}
		return Math.abs(sum);
	}
}
