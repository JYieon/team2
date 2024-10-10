package common;

import 최지연.Rinse;
import 이유나.onoff;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		//세탁기
		Scanner input = new Scanner(System.in);
		int num;
		
		Rinse r = new Rinse();
		onoff o = new onoff();
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
			case 1:
				o.display();
				break;
			case 2:
				
				r.display();
				break;
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("[종료]");
				bool = false;
				break;
			}
		}
	}
}
