package Anno.type02;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Emp {
	public Designer() {
		System.out.println("Designer...");
	}

	@Override
	public void gotoOffice() {
		System.out.println("디자이너 출근!");
	}

	@Override
	public void gotoHome() {
		System.out.println("디자니어 퇴근!");
	}

}
