package co.edu.IO;

import java.io.IOException;
import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) {
		
		//데이터 입력을 받기 위해 scanner 선언
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("스캐너 값을 입력하세요.");
			String str = sc.nextLine();
			System.out.println("입력값 : " + str);
			if(str.equals("q")) { //점 이퀄즈는 내가 넣은 데이터 비교하는거
				break; // while은 반복문, break는 q를 넣었을때 종료한다는 뜻
			}
		}
		
		
		System.out.println("스캐너 값을 입력하세요.");
		String str = sc.nextLine();
		//int value = sc.nextInt();
		System.out.println("입력값 : " + str);
		
		
		
		/* 괄호 안 내용 그대로 출력
		System.out.println(false);
		//괄호 안 내용 출력 후 엔터ln
		System.out.println();
		//괄호 안의 내용 커스텀해서 출력 콤마기준 앞에는 출력할 거, 들어갈 데이터는 콤마 뒤에
		System.out.printf(null, args); 
		
		
		//printf 정수
		int value = 100;
		System.out.printf("%d\n", value); //퍼센트 d자리에 value값을 넣음, \n은 엔터키 = 퍼센트디(정수형 타입용) 자리에 벨류값 넣고 백슬러시 엔으로 다음줄 넘긴다는 뜻
		System.out.printf("%5d\n", value); //공백2칸에 1,0,0 더하면 다섯자리라서 5. 5자리에 데이터를 넣고, 남은 공간은 내 데이터 앞에 공백처리
		System.out.printf("%-5d\n", value); //5자리에 테이터를 넣고, 남은 공간은 데이터 뒤에 공백처리
		System.out.printf("%05d\n", value);
		
		//printf실수
		double value2 = 12.123;
		
		System.out.printf("%.2f\n", value2); //소수점 아래 2개까지만 표현
		System.out.printf("%9.4f\n", value2); //자리수 총 9자리 표현, 소수점 아래 4개까지만 출력. 남은 공백은 앞에 넣어달라
		System.out.printf("%-9.0f\n", value2); //0.은 소수점 아래 아무것도 표현x 9자리에 데이터 넣고 남은 공백은 뒤에 넣어달라 
		
		
		try {
			System.out.println("값을 입력하세요.");
			int keyCode = System.in.read();
			System.out.println("입력값 : " + keyCode); 
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} */
		

		
			
		
	}
}
