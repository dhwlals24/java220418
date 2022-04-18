package co.yedam.var;

public class VariableExample {

	public static void main(String[] args) {
		
		int var1 = 0b1011; //2진수
		int var2 = 0206;  //8진수
		int var3 = 365;  //10진수
		int var4 = 0xB3;  //16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		/*long longVar1 = 10;
		long longVar2 = 20L;
		long longVar3 = 10000000000;  //인트 정수 범위 초과해서 에러 
		long longVar4 = 10000000000L; */
		
		char c1 = 'A'; //char 작은따옴표 안에 한 글자는 문자라고 부름
		char c2 = 65;
		char c3 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// String str = "AB"; 스트링 큰따옴표 안에 한개 이상 문자는 문자열. 스트링은 기본타입 아니라 참조타입
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
        System.out.println("번호\t이름\t직업");		
		
		String str = "나는 \"자바\"를 좋아합니다.";
		System.out.println(str);
		
		//실수 타입 : float, double
		
		// float floatVar1 = 3.14; 실수 데이터 타입은 아무것도 없으면 더블로 인식해서 에러뜸
		// float floatVar2 = 3.14f;  플롯 데이터 타입으로 인식할 수 있게 f를 넣어줘야함
		
		
		double doubleVar1 = 0.321;
	
		float floatVar3 = 0.1234567890123456789f; //소수점 아래 8자리까지 표시됨
		double doubleVar2 = 0.1234567890123456789; //소수점 아래18자리 표시됨
		
		System.out.println(floatVar3);
		System.out.println(doubleVar2);
		
		
		
		//논리 타입 : boolean
		boolean stop = true;
		// 5 > 3 = true
		boolean state = false;
		
		if(5 > 3) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
			}
		}
}
		




		
		