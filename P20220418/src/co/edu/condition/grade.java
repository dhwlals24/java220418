package co.edu.condition;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {

		boolean run = true; //run은 주사위 6 나왔을 때 멈추기 위해 넣음
		
		while (run) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("주사위의 수는 : " + num);

			switch (num) {
			case 1: // case 1 : 변수가 값 1일 경우
				System.out.println("1번이 나왔습니다.");
				break; // break : 다음 case를 실행하지 않고 확인 안하고 switch문 빠져나가기. 
				// case문에 있는 break는 switch에 들어온 변수랑 case랑 일치할 때 밑에 남은 case랑 매칭할 필요 없어져서 멈추는거 
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				run = false;
				break;  
				
				// 1. 섭씨, 화씨 -> c = 5/9(F-32)   scanner -> 화씨 데이터 받고 화씨 섭씨로 변환 프로그램
				// 2. 가위 바위 보 (반복문 x). scanner, random    가위(0), 바위(1) 보(2) 게임
				// 학점 관리 프로그램 - switch문(조건문이 안먹힘)만 사용해서 출력하기   scanner -> data  100~90 : A, 89~80 : B, 79~70 : C
		
		
	
		
		

		
		

	}
	
}
