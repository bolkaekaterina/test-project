package by.htp.task04.main;


public class ComplexView {
	public void printComplexSum(ComplexNumber number1, ComplexNumber number2, ComplexNumber result) {

		System.out.println("(" + number1.getReal() + " + " + number1.getImaginary() + "i) + (" + number2.getReal()
				+ " + " + number2.getImaginary() + "i) = (" + result.getReal() + " + " + result.getImaginary() + "i)");
	}

	public void printComplexSubctract(ComplexNumber number1, ComplexNumber number2, ComplexNumber result) {

		System.out.println("(" + number1.getReal() + " + " + number1.getImaginary() + "i) - (" + number2.getReal()
				+ " + " + number2.getImaginary() + "i) = (" + result.getReal() + " + " + result.getImaginary() + "i)");
	}
}
