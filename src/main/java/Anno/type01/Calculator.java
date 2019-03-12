package Anno.type01;

public class Calculator {
	public Calculator() {
		System.out.println("Calculator : " + this);
	}
	
	public void addition(int firstNum, int secondNum) {
		System.out.println("Addition : " + (firstNum + secondNum));
	}
	
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("subtraction : " + (firstNum - secondNum));
	}

	public void multiplication(int firstNum, int secondNum) {
		System.out.println("multiplication : " + (firstNum * secondNum));
	}
	
	public void division(int firstNum, int secondNum) {
		System.out.println("division : " + (firstNum / secondNum));
	}
}
