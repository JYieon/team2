package 이유나;

import java.util.Scanner;

public class onoff {
	private boolean mode = false;
	
	public boolean getMode() {return mode;}
	public void setMode(boolean mode) { 
		this.mode = mode; }
		public void display() {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean bool = true;
		
		while(bool) {
			System.out.println("--------------------------");
			System.out.println("[전원]");
			System.out.println("1. 현재 전원 상태 확인");
			System.out.println("2. 전원 켜기");
			System.out.println("3. 전원 끄기");
			System.out.println("4. 나가기");
			System.out.print(" >>>>> ");
			num = scan.nextInt();
			switch(num) {
			case 1 : 
					System.out.print("현재 전원 상태 : ");
					if (getMode()) {
						System.out.println("전원 켜짐");
					} else {
						System.out.println("전원 꺼짐");
					}
					break;
			
			case 2: 
					System.out.println("전원 켜짐");
					setMode(true);
					break;
					
			case 3 : 
					System.out.println("전원 꺼짐");
					setMode(false);
					break;
					
			case 4 :
					System.out.println("[전원 나가기]");
					bool = false;
					break;
			}
			
		}
		
	}
}
