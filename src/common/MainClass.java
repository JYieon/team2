package common;

import java.util.Scanner;

import 전영민.Ex01;


public class MainClass {
	
	public static void main(String[] args) {
		Ex01 t = new Ex01();
	
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
			case 4: t.display();
			case 5:
			case 6:
				
			}
		}
	}
}
