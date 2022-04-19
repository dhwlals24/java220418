package co.edu.condition;

import java.util.Scanner;

public class rockpaper {

	public static void main(String[] args) {
		System.out.println("가위(0), 바위(1), 보(2) 중 한 가지를 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
		
		// 플레이어
		int player = sc2.nextInt();
		if (player == 0) {
			System.out.println("플레이어 : 가위");
		}
		if (player == 1) {
			System.out.println("플레이어 : 바위");
		}
		if (player == 2) {
			System.out.println("플레이어 : 보");
		}

		// 컴퓨터
		int com = (int) (Math.random() * 3);
		if (com == 0) {
			System.out.println("컴퓨터 : 가위");
		}
		if (com == 1) {
			System.out.println("컴퓨터 : 바위");
		}
		if (com == 2) {
			System.out.println("컴퓨터 : 보");
		}
		
		
		// 결과
		if (player == 0) {
			if (com == 0) {
				System.out.println("결과 : 무승부");
			}
			if (com == 1) {
				System.out.println("결과 : 패배ㅠㅠ");
			}
			if (com == 2) {
				System.out.println("결과 : 승리!!");
			}	
		}
		
		if (player == 1) {
			if (com == 0) {
				System.out.println("결과 : 승리!!");
			}
			if (com == 1) {
				System.out.println("결과 : 무승부");
			}
			if (com == 2) {
				System.out.println("결과 : 패배ㅠㅠ");
			}	
		}
		
		if (player == 2) {
			if (com == 0) {
				System.out.println("결과 : 패배ㅠㅠ");
			}
			if (com == 1) {
				System.out.println("결과 : 승리!!");
			}
			if (com == 2) {
				System.out.println("결과 : 무승부");
			}	
		}
		
		
		

}
}
