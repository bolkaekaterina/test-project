package by.htp.task04.main;


public class ComplexLogic {
	public ComplexNumber sum(ComplexNumber number1, ComplexNumber number2) {

		return new ComplexNumber(number1.getReal() + number2.getReal(),
				number1.getImaginary() + number2.getImaginary());
	}

	public ComplexNumber substract(ComplexNumber number1, ComplexNumber number2) {

		return new ComplexNumber(number1.getReal() - number2.getReal(),
				number1.getImaginary() - number2.getImaginary());
	}
}
