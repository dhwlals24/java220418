package co.edu.loop;

import java.util.Scanner;

public class edu {

	public static void main(String[] args) {

		/*
		 * 1. 화씨를 섭씨로 Scanner sc = new Scanner(System.in);
		 * System.out.println("화씨를 입력하세요"); int c_temp = sc.nextInt(); double f_temp = 5
		 * / 9.0 * (c_temp - 32); System.out.printf("%.2f\n", f_temp);
		 * 
		 * // 2. 가위 바위 보 // 0,0|0,1| 0,2| 1,0| 1,1| 1,2| 2,0| 2,1| 2,2
		 * 
		 * System.out.println("가위(0), 바위(1), 보(2)"); int user = sc.nextInt(); int random
		 * = (int) (Math.random() * 3);
		 * 
		 * switch (user) { case 0: if (random == 1) { System.out.println("졌습니다."); }
		 * else if (random == 2) { System.out.println("이겼습니다."); } else {
		 * System.out.println("비겼습니다."); } break; case 1: case 2: }
		 * 
		 * // 3. 학점관리 프로그램 System.out.println("점수를 입력하세요"); int point = sc.nextInt(); if
		 * (point / 10 > 10) { point = 10; // 100보다 큰 숫자가 들어올 떄 10으로 처리 }
		 * 
		 * // 100~90, 89~80, 79~70 switch (point) { case 10: case 9:
		 * System.out.println("A학점"); break; case 8: System.out.println("B학점"); break;
		 * case 7: System.out.println("C학점"); break; }
		 * 
		 * // 반복문 int sum = 0;
		 * 
		 * sum += 1; sum += 2; sum += 3; sum += 4; sum += 5;
		 * 
		 * System.out.println("1~5의 합 : " + sum);
		 * 
		 * // 1~5까지의 합을 만들어보는 프로그램 for (int i = 1; i <= 5; i++) { // 첫번째 sum = 0 // 1)
		 * i=1, 0=0+1; -> sum=1; // 2) i=2, 1=1+2; -> sum=3; // 3) i=3, 3=3+3; -> sum=6;
		 * // 4) i=4, 6=6+4; -> sum=10; // 5) i=5, 10=10+5; -> 최종적 sum=15;
		 * 
		 * sum = sum + i;
		 * 
		 * }
		 * 
		 * // 구구단 2단 만들기 for (int i = 1; i <= 9; i++) { //System.out.println("2단 : 2 * "
		 * + i + " = " + (2 * i)); for(int j=1; j<=9; j++) { //중첩 for문
		 * System.out.println(i+" * " + j + " = " + i*j); } }
		 * 
		 * // 1부터 100사이 3의 배수, 2의 배수 for (int i = 1; i <= 100; i++) { if (i % 3 == 0) {
		 * // 3으로 나눴을 때 나머지가 딱 떨어짐 = 3의 배수 System.out.println("3의 배수 : " + i); } if (i %
		 * 2 == 0) { // 2의 배수 System.out.println("2의 배수 : " + i); } }
		 * 
		 * // 홀짝 for (int i = 1; i <= 100; i++) { if (i % 2 == 1) { // 홀
		 * System.out.println("홀수 : " + i); } else if (i % 2 == 0) { // 짝
		 * System.out.println("짝수 : " + i); } }
		 * 
		 * 
		 */

		// *
		// **
		// ***
		// ****
		// ***** i<=5랑 밑에거랑 같음
		for (int i = 1; i < 6; i++) {
			// 1=1 (ㅇ), 1=2(x)
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); // 프린트에 엔터키 안넣어줌 연속으로 두개 찍기위해
			}

			System.out.println(); // 엔터 내려가서 별 하나씩 증가시킴
		}

		System.out.println("end of prog");

		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 5; i > 0; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("end of prog");

		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i < 6; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("end of prog");
		

		// * 다른 방법
		// **
		// ***
		// ****
		// *****
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
