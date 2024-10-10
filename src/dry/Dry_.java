package dry;

import java.util.Scanner;

public class Dry_ {
	private boolean mode = false;
	private int time;
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public boolean getMode() {
		return mode;
	}
	public void setMode(boolean mode) {
		this.mode = mode;
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		
		while(bool) {
			System.out.println("-----------------------------");
			System.out.println("[드라이]");
			System.out.println("1. 현재 드라이 모드");
			System.out.println("2. 드라이 on");
			System.out.println("3. 드라이 off");
			System.out.println("4. 건조시간 선택 ");
			System.out.println("5. 선택한 건조 시간");
			System.out.println("6. 종료");
			System.out.print(">>> : ");
			int num = input.nextInt();
			
			switch(num) {
			case 1:
				if(getMode()) {
					System.out.println("현재 드라이 모드 : on");
				}else {
					System.out.println("현재 드라이 모드 : off");
				}
				
				break;
			case 2:
				System.out.println("드라이 on");
				setMode(true);
				break;
			case 3:
				System.out.println("드라이 off");
				setMode(false);
				break;
			case 4:
				if(getMode()) {
					System.out.print("건조 시간 입력 : ");
					time = input.nextInt();
					setTime(time);
				}else {
					System.out.println("현재 건조 모드는 off 입니다.");
				}
				break;
				
			case 5:
				if(getMode()) {
					System.out.println("건조시간은"+ getTime()+"분 입니다.");
					break;	
				}else {
					System.out.println("현재 건조 모드는 off 입니다.");
				}
				break;
			case 6:
				System.out.println("[나가기]");
				bool = false;
				break;
			}
		}
	}
	
}
