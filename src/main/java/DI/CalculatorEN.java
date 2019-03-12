package DI;

public class CalculatorEN implements Calculator {
	public CalculatorEN() {
		System.out.println("CalculatorEN : " + this);
	}
	
	public void addition(int firstNum, int secondNum) {
		System.out.println("Addition : " + (firstNum + secondNum));
	}
	
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("subtraction : " + (firstNum - secondNum));
	}

	public void multiplication(int firstNum, int secondNum) {
		System.out.println("subtraction : " + (firstNum * secondNum));
	}
	
	public void division(int firstNum, int secondNum) {
		System.out.println("subtraction : " + (firstNum / secondNum));
	}
}
