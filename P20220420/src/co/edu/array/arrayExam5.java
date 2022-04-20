package co.edu.array;

import java.util.Scanner;

public class arrayExam5 {

	public static void main(String[] args) {

		// 참조타입 String배열 생성

//		String[] strAry = {"김","이","박","최"};
//		
//		//향상된 for문을 이용해서 각각의 배열 요소 출력
//		for(String name : strAry) { //string에 맞는 데이터를 담아야 함
//			System.out.println(name);
//		} //김부터 최까지 하나씩 가져와서 변수에 담아줌. 데이터 없으면 자동 종료됨

//		// 202페이지 예제
//		boolean run = true; //true면 반복문 실행
//		int studentNum = 0; //배열 크기
//		int[] scores = null; //배열에 데이터 담기 위해
//		Scanner sc = new Scanner(System.in);
//
//		while (run) {
//			System.out.println("----------------------------------------------");
//			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료"); // 학생수는 배열크기, 각각 학생수 항목에 데이터 (점수)입력, 입력한 배열
//																			// 출력, 분석은 최대 최저값
//			System.out.println("----------------------------------------------");
//			System.out.println("선택>");
//
//			int selectNo = Integer.parseInt(sc.nextLine()); //문자열을 받을 수 있는 스캐너 기능. 문자열을 정수 타입으로 변환
//
//			if (selectNo == 1) {
//				
//			} else if (selectNo == 2) {
//	
//
//			} else if (selectNo == 3) {
//				
//			} else if (selectNo == 4) {
//
//			} else if (selectNo == 5) {
//				run = false;
//			}
			
			
			
			
			//202페이지 답안
			boolean run = true; //true면 반복문 실행
			int studentNum = 0; //배열 크기
			int[] scores = null; //배열에 데이터 담기 위해
			Scanner sc = new Scanner(System.in);

			while (run) {
				System.out.println("----------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료"); // 학생수는 배열크기, 각각 학생수 항목에 데이터 (점수)입력, 입력한 배열
																				// 출력, 분석은 최대 최저값
				System.out.println("----------------------------------------------");
				System.out.println("선택>");

				int selectNo = Integer.parseInt(sc.nextLine()); //문자열을 받을 수 있는 스캐너 기능. 문자열을 정수 타입으로 변환

				if (selectNo == 1) {
					
					System.out.println("학생수>");
					
					studentNum = sc.nextInt();
					
					scores = new int[studentNum];
					
					sc.nextLine(); //nextint 밑에 nextline 넣으면 입력된 엔터키 때문에 오류 발생 안함
					
				} else if (selectNo == 2) {
		            
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores["+i+"]>");
						scores[i] = sc.nextInt(); //스캐너 이용해서 데이터 입력
					}
					sc.nextLine();

				} else if (selectNo == 3) {
					
					for(int i=0; i<scores.length; i++) {
						System.out.println("scores["+i+"]>" + scores[i]);
					}
					
				} else if (selectNo == 4) {
					
					int sum = 0;
					int max = 0;
					for(int i=0; i<scores.length; i++) {
						
						max = max < scores[i] ? scores[i] : max;
						
						if(max < scores[i]) {
							max = scores[i];
						}
						sum += scores[i];
					}
					System.out.println("최고 점수 : " + max);
					System.out.printf("평균 점수 : %.2f/n", (double)sum / scores.length);

				} else if (selectNo == 5) {
					run = false;
				}

		}
        System.out.println("종료");
	}

}
