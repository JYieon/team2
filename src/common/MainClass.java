package common;

import java.util.Scanner;
import 최지연.Rinse;
import 이유나.onoff;
import 정성호.Dry_;
import 전영민.Ex01;
import 김수지.Washer;

public class MainClass {
	//세탁기. 기본적으로 전원 꺼져있음
	public static void main(String[] args) {
		Ex01 t = new Ex01(); // 물온도
		Washer w = new Washer(); //탈수
		Rinse r = new Rinse(); //헹굼
		onoff o = new onoff(); //전원
		Dry_ d = new Dry_(); //건조
		
		Scanner input = new Scanner(System.in);
		int num;
		
		boolean bool = true;
		while(bool) {
			System.out.println("-----------------------------");
			System.out.println("[세탁기]");
			System.out.println("1. 전원");
			System.out.println("2. 헹굼");
			System.out.println("3. 탈수");
			System.out.println("4. 물온도");
			System.out.println("5. 건조");
			System.out.println("6. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			
			switch(num) {
			case 1: //전원
				o.display();
				break;
			case 2: //헹굼
				if(o.getMode()) {
					r.display();
				}else {
					System.out.println("세탁기 전원이 off상태 입니다.");
				}
				
				break;
			case 3: //탈수
				if(o.getMode()) {
					w.display();
				}else {
					System.out.println("세탁기 전원이 off상태 입니다.");
				}
				break;
			case 4: //물온도
				if(o.getMode()) {
					t.display();
				}else {
					System.out.println("세탁기 전원이 off상태 입니다.");
				}
				break;
			
			case 5: //건조
				if(o.getMode()) {
					d.display();
				}else {
					System.out.println("세탁기 전원이 off상태 입니다.");
				}
				
				break;
			case 6: //종료
				System.out.println("[종료]");
				bool = false;
				break;
			}
		}
	}
}
