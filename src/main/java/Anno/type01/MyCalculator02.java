package Anno.type01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyCalculator02 {
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	
	public MyCalculator02() {
//		calculator = new CalculatorEN(); // 내부에서 만드는 것이 아니라,
	}
	
	public MyCalculator02(Calculator calculator) {
		this.calculator = calculator; // 외부에서 만들어 주입한다. (DI)
		System.out.println("생성자 의존 주입...");
	}
	
	public MyCalculator02(int firstNum, int secondNum) {
		this();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	public MyCalculator02(int firstNum, int secondNum, Calculator calculator) {
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
	
	
	// @Autowried를 활용해 자동 연결을 하지만,
	// 한정자(@Qualifier)를 추가해 대상을 식별할 수 있도록!
	@Autowired
	@Qualifier("type01")
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		System.out.println("Setter 의존 주입...");
		System.out.println("주입 대상 : " + calculator);
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
