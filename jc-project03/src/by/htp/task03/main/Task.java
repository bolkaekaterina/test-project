package by.htp.task03.main;

public class Task {
	
public static void main(String[] args) {
				
		int[][] mass = {{ 3, 5, -7, 9, 8 }, 
						{ 7, 8, -5, 8, 5 }, 
						{ 2, -5, 7, 6, 8 }, 
						{ -5, 8, 3, 7, 3},
						{ 3,  5, 8, 7, 3}};

		System.out.print(Function.getOddNegativeSum(mass));
		
	}
}
