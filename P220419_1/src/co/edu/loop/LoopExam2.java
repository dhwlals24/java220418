package co.edu.loop;

import java.util.Scanner;

public class LoopExam2 {

	public static void main(String[] args) {

	/*	Scanner sc = new Scanner(System.in);
		// true, false;

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("주사위 값 : " + num);
			if (num == 6) {
				break;
			}

		}
		
		
		boolean flag = true;
		int sum = 0;
		while(flag) {
			System.out.println("정수를 입력하세요.");
			int value = sc.nextInt();
			
			if (value == -1) {
				System.out.println("탈출 숫자 입력");
				flag =false; //-1치면 true 만족못해서 while문 탈출됨 
				continue;
			}
			sum += value;
		}
		System.out.println("정수의 합 : " + sum); */
		
		
		Scanner sc = new Scanner (System.in);
		
		boolean run =true; //while문 실행하기 위해 true넣음
		int balance =0; //계좌
		int menu =0; //switch 또는 if문 사용가능
		int withDraw = 0; //출금
		int deposit = 0; //예금
	
		
		while(run) { //false -> 조건 만족 -> while종료
			System.out.println("-------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.println("선택>");
			menu = sc.nextInt(); //4가지 중 하나 선택
			
			switch (menu) {
			case 1:
				System.out.println("예금액>");
				deposit = sc.nextInt(); //임시로 데이터 담는 공간
				balance += deposit;
				break; //끊고 다시 런으로 돌아감
			case 2:
				System.out.println("출금액>");
				withDraw = sc.nextInt();
				
				if(balance < withDraw) {
					System.out.println("잔고 부족"); //만약 출금액이 계좌에 있는 돈보다 많을 때
				} else {
				    balance -= withDraw;
				}
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				System.out.println("종료");
				run = false;
				break;
			}
			
		}
		System.out.println("프로그램 종료");

	}
}
