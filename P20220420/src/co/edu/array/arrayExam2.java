package co.edu.array;

import java.util.Scanner;

public class arrayExam2 {

	public static void main(String[] args) {
		
		int[] ary1 = {5,10,4,7,8};
		
		//최대값 변수
		int max = 0;
		//최소값 변수
		int min = ary1[0]; //반복문 최소값 구할때는 첫번째 데이터를 넣어야됨. 0넣으면 그냥 0나옴. 이유 : 여기서 0보다 작은 숫자 없어서
		for(int i=0; i<ary1.length; i++) {
			//최대값 구하기
			if(max < ary1[i]) {
				max = ary1[i];
			}
			
			//최소값 구하기
			if(min > ary1[i]) {
				min = ary1[i];
			}
			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int[] ary2 = null; //배열을 만들되 사이즈는 아직 정하지 않겠다
		System.out.println("배열의 사이즈를 입력하세요.");
		int num = sc.nextInt(); //배열 사이즈 입력
		//배열 사이즈 입력한 값으로 배열 크기 설정 -> 입력할때마다 배열 사이즈 바꿀수 있음
		ary2 = new int[num];
		
		for(int i=0; i<ary2.length; i++) {
			ary2[i] = i+1; //1~배열의 크기만큼 데이터 입력 (플러스 1 해줬기 때문에)
		}
		
		for(int i=0; i<ary2.length; i++) {
			/* if(ary2[i] % 2 == 0) { //2의 배수 구하기 ex)100입력하면 1~100까지 2의 배수 나옴
				System.out.println(ary2[i]); */
			//홀수만 출력하기
			if(ary2[i] % 2 == 1) { //2로 나눴을때 나머지 1이면 홀수
				System.out.println(ary2[i]);
			}
		}
		
		
		//중첩 반복문, 조건문을 이용한 데이터 출력
		int[] ary3 = new int[num]; //아직 데이터 없는 상태
		for(int i=0; i<ary3.length; i++) { //length대신 num도 됨
			ary3[i] = i;
		}
		for(int i=0; i<ary2.length; i++) {
			for(int j=0; j<ary3.length; j++) {
				//조건
			    //ary2의 데이터 + ary3의 데이터 < 10이 나오는 경우
				if(ary2[i]+ary3[j] < 10) {
		System.out.println("1." + ary2[i] + " 2." +ary3[j]);
				}
			}
		}
		
		
	}

}
