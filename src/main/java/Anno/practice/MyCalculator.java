package Anno.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
	public MyCalculator(Calculator calculatorEN) {
		this.calculator = calculatorEN;
	}
	
	// 의존 주입과 동시에 생성자에 value까지 전달 또는 property 활용
	public MyCalculator(int firstNum, int secondNum, Calculator calculator) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}
	
	// practice.xml에 등록된 두 빈 EN과, KR이 다르더라도,
	// @Autowired 연견될 메소드가 둘 다 받을 수 있다면 -> No Unique
	// @Qualifier 한정자를 이용해 식별!
	@Autowired
	@Qualifier("typeEN")
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		System.out.println("주입 대상 : " + calculator);
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
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
