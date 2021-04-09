package by.htp.task02.main;

public class Function {

	public static boolean isFirstNumberInArrayPositive(int[] array) {

		String n = "Раньше встречается положительное число";
		String s = "Раньше встречается отрицательное число";

		if (array[0] >= 0) {
			System.out.println(n);
			return (true);
		} else {
			System.out.println(s);
			return (false);
		}
	}
}