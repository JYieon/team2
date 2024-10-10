package 최지연;

import java.util.Scanner;

public class Rinse { //헹굼
	private boolean mode = false;
	private int water = 4;
	
	public boolean getMode() {
		return mode;
	}
	public void setMode(boolean m) {
		this.mode = m;
	}
	
	public int getWater() {
		return water;
	}
	public void setWater(int w) {
		this.water = w;
	}
	
	public void display() {
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		
		while(bool) {
			System.out.println("-----------------------------");
			System.out.println("[헹굼]");
			System.out.println("1. 현재 헹굼모드");
			System.out.println("2. 헹굼 on");
			System.out.println("3. 헹굼 off");
			System.out.println("4. 현재 물높이");
			System.out.println("5. 물높이 맞추기");
			System.out.println("6. 나가기");
			System.out.print(">>> : ");
			int num = input.nextInt();
			
			switch(num) {
			case 1:
				if(getMode()) {
					System.out.println("현재 헹굼 모드 : on");
				}else {
					System.out.println("현재 헹굼 모드 : off");
				}
				
				break;
			case 2:
				System.out.println("헹굼 on");
				setMode(true);
				break;
			case 3:
				System.out.println("헹굼 off");
				setMode(false);
				break;
			case 4:
				if(getMode()) {
					System.out.println("현재 물높이 : " + getWater());
				}else {
					System.out.println("현재 헹굼 모드는 off 입니다.");
				}
				break;
				
			case 5:
				if(getMode()) {
					System.out.print("물높이 입력(1~9) : ");
					int water = input.nextInt();
					if(water < 1 || water > 9) {
						System.out.println("물높이 입력 범위가 아닙니다.");
					}else {
						setWater(water);
					}
					break;
					
				}else {
					System.out.println("현재 헹굼 모드는 off 입니다.");
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
