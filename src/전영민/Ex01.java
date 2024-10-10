package 전영민;

import java.util.Scanner;

public class Ex01 { //물온도
	private boolean mode = false;
	private int water =20;
	

	public boolean getMode() {
		return mode;
	}
	public void setMode(boolean m) {
		this.mode = m;
	}


	public void display() {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int n1 =25, n2=50, n3 = 75;

		boolean bool = true;

		while(bool) {
			System.out.println("-----------------------------");
			System.out.println("[물온도]");
			System.out.println("1. 현재 모드");
			System.out.println("2. on");
			System.out.println("3. off");
			System.out.println("4. 현재 온도");
			System.out.println("5. 희망 온도");
			System.out.println("6. 나가기");
			System.out.print(">>> : ");
			int num = input.nextInt();

			switch(num) {
			case 1:
				if(getMode()) {
					System.out.println("현재 모드 : on");
				}else {
					System.out.println("현재 모드 : off");
				}

				break;

			case 2:
				System.out.println("on");
				setMode(true);
				break;

			case 3:
				System.out.println("off");
				setMode(false);
				break;

			case 4:
				System.out.println("현재 온도 : " +water + "도" );





				break;

			case 5:
				System.out.println("버튼을 눌러 온도를 설정을 하시오.\n 1번은 25도 2번은 50 3번은 75");

				n = input.nextInt();
				
				if(n == 1) {
					System.out.println("희망 온도는"+ n1 + "도 입니다.");
				}else if (n == 2) {
					System.out.println("희망 온도는"+ n2 + "도 입니다.");
				}else if (n == 3) {
					System.out.println("희망 온도는"+ n3 + "도 입니다.");
				}
					break;

			case 6:
				System.out.println("[나가기]");
				bool = false;
				break;
				}
			}
		}}