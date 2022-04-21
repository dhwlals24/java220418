package co.edu.array;

import java.util.Scanner;

public class arrayExam5 {

	public static void main(String[] args) {

//		// 참조타입 String배열 생성
//
//		String[] strAry = {"김","이","박","최"};
//		
//		//향상된 for문을 이용해서 각각의 배열 요소 출력
//		for(String name : strAry) { //string에 맞는 데이터를 담아야 함
//			System.out.println(name);
//		} //김부터 최까지 하나씩 가져와서 변수에 담아줌. 데이터 없으면 자동 종료됨

		// 202페이지 예제
		boolean run = true; // true면 반복문 실행
		int studentNum = 0; // 배열 크기
		int[] scores = null; // 배열에 데이터 담기 위해
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			// 학생수: 배열크기, 점수입력 : 각각 학생수 항목에 데이터 (점수)입력, 점수리스트 : 입력한 배열
			// 분석 : 최대값, 평균
			System.out.println("----------------------------------------------");
			System.out.println("선택>");

			int selectNo = Integer.parseInt(sc.nextLine()); // 문자열을 받을 수 있는 스캐너 기능. 문자열을 정수 타입으로 변환

			if (selectNo == 1) {
               
				System.out.println("학생수를 입력하세요>");
				
				studentNum = sc.nextInt();
				
				scores = new int[studentNum];
				
				sc.nextLine();
				
			} else if (selectNo == 2) {
				
				for(int i=0; i<scores.length; i++) {
					System.out.println("학생번호 " + i +" >");
					scores[i] = sc.nextInt();
				}
				
				sc.nextLine();

			} else if (selectNo == 3) {
				
				for(int i=0; i<scores.length; i++) {
					System.out.println("학생번호 " + i +" > " + scores[i] + "점");
				}

			} else if (selectNo == 4) {
				
				int max = 0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					 if(max < scores[i]) {
						 max = scores[i];
					 }
					
					 sum += scores[i];
				}
				
				System.out.println("최고 점수 : " + max);
				System.out.printf("평균 점수 : %.2f/n", (double)sum / scores.length );

			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("종료");

	}
}
