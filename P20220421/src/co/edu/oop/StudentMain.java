package co.edu.oop;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		// 1명 관리 학생 관리 프로그램
		// 학생 정보 : 학번, 이름, 국어, 수학, 영어
		// 기본 생성자를 통한 인스턴스만들고, 인스턴스에 데이터 입력.
		// 1. 학생의 기본 정보 출력(학번, 이름, 국어, 수학, 영어)
		// 2. 학생의 점수 평균 출력(국어, 수학, 영어)
		
		
		Scanner sc = new Scanner(System.in); //입력 스캐너 필요함
		
		Student st = new Student (2018114173, "오지민", 86, 90, 68);
		
		int menu =0;
		
		System.out.println("[학생 관리 프로그램]");
		System.out.println("1.기본 정보  2.점수 평균");
		System.out.println("선택하세요->");
		menu = Integer.parseInt(sc.nextLine());
		
		
		
		while(true) {
			if(menu == 1) {
				System.out.println("기본 정보 확인->");
			
				break;
			}
			else if(menu == 2) {
				System.out.println("점수 평균 확인->");
				break;
				
			}
		}

	}

}
