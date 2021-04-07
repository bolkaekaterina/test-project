package by.htp.task01.main;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		double r = 0;
		double c = 0;
		double s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите радиус:");

		while (!sc.hasNextDouble()) {
			System.out.println("Некорректный ввод данных:");
			sc.nextLine();
		}

		r = sc.nextDouble();

		c = Functions.circleLength(r);
		System.out.printf("Длина окружности = " + "%.2f\n", c);
		

		s = Functions.circleArea(r);
		System.out.printf("Площадь круга = " + "%.2f\n", s);
		
		sc.close();

	}

}
