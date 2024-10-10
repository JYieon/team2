package common;

import java.util.Scanner;

import dry.Dry_;

public class MainClass {
	public static void main(String[] args) {
		//세탁기
		Scanner input = new Scanner(System.in);
		
		int num;
		
		while(true) {
			System.out.println("1. 전원");
			System.out.println("2. 헹굼");
			System.out.println("3. 탈수");
			System.out.println("4. 물온도");
			System.out.println("5. 건조");
			System.out.println("6. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch(num) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				Dry_ t = new Dry_();
				int dry_time;
				boolean start = t.getOn();
				int time;
				System.out.print("건조 할 시간 : ");
				dry_time = input.nextInt();
				t.setDry_time(dry_time);
				t.setTime(dry_time);
				time = t.getTime();
				t.setN("ON");
				while(start) {
					if(time == dry_time) {
						System.out.println("작동 상태 : " + t.getN());
					}
					time -= 1;
					System.out.println("현재 남은 시간 :" + time);
					if(time == 0) {
						t.setN("OFF");
						System.out.println("작동 상태 : " + t.getN());
						start = t.getOff();
					}
				}
				break;
			case 6:
				
			}
		}
	}
}
