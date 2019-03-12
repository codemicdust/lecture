package DI;

public class MyCalculator {
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	
	public MyCalculator() {
		// 자바의 캡슐화 예제, 의존 주입과 상관 없다.
//		calculator = new CalculatorEN();
		// UserMain01 시험 시 주석을 풀고,
		// UserMain05에서 발생하는 중복 생성을 막으려면, 주석 처리!
	}
	
	
	public MyCalculator(int firstNum, int secondNum) {
		this();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	// MyCalculator는 전달된 Calculator 객체에 의존!
	public MyCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	// 의존 주입과 동시에 생성자에 value까지 전달 또는 property 활용
	public MyCalculator(int firstNum, int secondNum, Calculator calculator) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}
}
