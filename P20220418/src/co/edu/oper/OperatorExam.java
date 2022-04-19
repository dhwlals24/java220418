package co.edu.oper;

public class OperatorExam {

	public static void main(String[] args) {
	
		// +, -, *, /, %
		//          / -> 나눗셈에서 몫만 가져옴
		//          % -> 몫을 제외한 나머지만 가져옴
		// 10000초 -> 10000/(60*60 60분에 60초 곱한거) => 시간
		//         -> 10000/60 => 분
		//         -> 10000%60 => 초
		
		int hour = 10000/(60*60); //10000초 -> 시간으로 변환
		int min = 10000/60; //10000초 -> 분으로 변환
		int sec = 10000%60; // 166분을 제외하고 남는 초 계산
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		
		
		// i = i +2;
		//대입 연산자
		// i += 2; //위의 식을 줄여씀
		
		//증감 연산자
		// i ++; i라는 변수에 +1. ++은 무조건 +1
		// i + i +1
		
		// i = i = j++; // 1 + 1
		// i = i + ++j; // 1 + (1+1) 앞에 ++있으면 계산하기 전에 +1
		
		int i = 0;
		int j = 0;
		
		i++;
		System.out.println(i); //0=0 0+1=1
		++i;
		System.out.println(i); // 0+1=1 1+1=2
		
		System.out.println(++i); //3 i값 1 증가 후 실행
		System.out.println(i++); //구문을 실행 후 i를 더해서 3 실행문 다 끝난 후i값 1 증가
		
		System.out.println(i); //뒤에 있는 ++은 구문이 끝이나고 +하기때문에 4
		
		
		
		
		
		
	}

}
