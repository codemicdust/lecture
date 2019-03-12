package Basic;

public class Unit {
	private String msg;
	public Unit() {
		System.out.println("Unit Loading ... ");
		msg = "Hello Unit Object";
	}
	public void prnMsg() {
		System.out.println("Unit msg : " + msg);
	}
}
