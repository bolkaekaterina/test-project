package by.htp.task04.main;

public class MainComplex {
	public static void main(String[] args) {

		ComplexNumber number1 = new ComplexNumber(4.4, 8.1);
		ComplexNumber number2 = new ComplexNumber(9.6, 4.3);

		ComplexNumber resultSum = new ComplexNumber();

		ComplexLogic logic = new ComplexLogic();
		resultSum = logic.sum(number1, number2);

		ComplexView view = new ComplexView();
		view.printComplexSum(number1, number2, resultSum);

		ComplexNumber resultSubstract = new ComplexNumber();
		resultSubstract = logic.substract(number1, number2);
		view.printComplexSubctract(number1, number2, resultSubstract);
	}
}
