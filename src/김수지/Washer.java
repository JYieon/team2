package 김수지;

import java.util.Scanner;

public class Washer {
	private int 탈수;
	private boolean mode = false;
	public boolean getMode() {
		return mode;
	}
	public void setMode(boolean m) {
		this.mode = m;
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int n = 0;
		String s1 = "약";
		String s2 = "중";
		String s3 = "강";

		System.out.println("----탈수 담당-----");

		while(true) {
			System.out.println("1. 현재 모드");
			System.out.println("2. 탈수 ON");
			System.out.println("3. 탈수 OFF");
			System.out.println("4. 탈수 세기");
			System.out.println("5. 현재 세기");
			System.out.println("6. 이전");
			System.out.println(">>>>");
			num = input.nextInt();

			switch (num) {
			case 1 : 
				if(getMode()) {
					System.out.println("현재 헹굼 모드 : on");
				}else {
					System.out.println("현재 헹굼 모드 : off");
				}

				break;

			case 2 : 
				System.out.println("탈수 on");
				setMode(true);
				
				break;
			

			case 3 : 
				System.out.println("탈수 off");
				setMode(false);
				break;


			case 4 :
				System.out.println("숫자 버튼을 입력하시오.\n 1번은 약, 2번은 중, 3번은 강");
				n = input.nextInt();
				if(n == 1) {
					System.out.println("약");
				}else if(n == 2) {
					System.out.println("중");
				}else if(n == 3) {
					System.out.println("강");
				}else {
					System.out.println("다시 입력 하시오.");
				}


				break;
			case 5 : if(n == 1 ) {
				System.out.println("현재 세기는 "+  s1  +" 입니다.");
			}else if (n == 2) {
				System.out.println("현재 세기는 " +  s2  +" 입니다.");
			}else if(n == 3) {
				System.out.println("현재 세기는 " +  s3  +" 입니다.");
			}


			break;

			case 6 : 

				return;
			}

		}			
	}
}
