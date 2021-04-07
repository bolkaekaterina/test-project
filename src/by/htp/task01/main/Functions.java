package by.htp.task01.main;

public class Functions {
	final static double Pi = 3.14159265358979;

	public static double circleLength(double radius) {
		double c = 2 * Pi * radius;
		return c;
	}

	public static double circleArea(double radius) {
		double s = Pi * Math.pow(radius, 2);
		return s;
	}

}
