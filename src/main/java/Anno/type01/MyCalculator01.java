package Anno.type01;

import org.springframework.beans.factory.annotation.Autowired;

public class MyCalculator01 {
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	
	public MyCalculator01() {
//		calculator = new CalculatorEN(); // 내부에서 만드는 것이 아니라,
	}
	
	
	public MyCalculator01(Calculator calculator) {
		this.calculator = calculator; // 외부에서 만들어 주입한다. (DI)
		System.out.println("생성자 의존 주입...");
	}
	
	
	public MyCalculator01(int firstNum, int secondNum) {
		this();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public MyCalculator01(int firstNum, int secondNum, Calculator calculator) {
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
	
	
	// Bean의 사항에 맞게 자동적으로 AppCtx의 의존을 자동으로 연결!(setter 호출)
	@Autowired
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		System.out.println("Setter 의존 주입...");
	}
	
//	@Autowired
//	public void setCalculatorAno(Calculator calculator) {
//		this.calculator = calculator;
//		System.out.println("Setter Ano 의존 주입...");
//	}
//	
	
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
