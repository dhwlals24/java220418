package co.edu.convert;

public class CalExam {
   public static void main(String[] arge) {
	   
	   /*정수+실수
	   int intValue = 10;
	   double doubleValue = 5.5;
	   double result = intValue + doubleValue;
	   System.out.println(result);
	   
	   
	   //자동타입변환 연산
	   byte x = 10;
	   byte y = 20;
	   
	   //byte result2 = x+y;
	   int result2 = x+y;
	   System.out.println(result);
	   
	   
	   char c = 'A'; //a는65 b는66
	   char d = 1;
	   int result3 = c+d;
	   System.out.println("유니코드 : " + result3);
	   System.out.println("출력문자 : " + (char)result3);
	   
	   
	   //실수타입변환
	   int i = 1;
       double result4;
	   
	   result4 = i/5;
	   System.out.println(result4);  // 원래 0.2인데 몫이 0이라서 이것만 표현. 정수끼리 계산해서 실수 타입에 넣어서 
	   
	   result4 = i/5.0;
	   System.out.println(result4);  // 1.0 나누기 5.0은 0.2 더블타입끼리 계산해서 소수가 표현됨
	   
	   result4 = (double) i/5;
	   System.out.println(result4);  // 0.2를 더블타입으로 데이터타입을 변환시킴 (원하는 타입 더블을 지정해줌)
	   
	   
	   
	   //문자열 + 연산
	   
	   //숫자 + 숫자
	   int value = 15;
	   System.out.println(value+3); // 여기서+는 덧셈연산
	   //문자열 + 숫자
	   System.out.println("문자열+숫자 : " + value + 2); //앞에가 string이라 전체가 string으로 결정됨 -> +연산자는 덧셈연산이 아니고 붙여주는 역할하게됨
	   System.out.println("문자열+숫자 : " + (value + 2));
	   //숫자 + 문자열
	   System.out.println(value+2 + " 숫자 + 문자열");
	   
	   //문자열 -> 숫자로 타입 변환
	   //(double), (int) = 숫자 연산에서만 사용 */
	   
	   String str = "1000";
	   int value1 = Integer.parseInt(str); //문자열을 int타입으로 변환
	   System.out.println(value1);
	   String str1 = "0.3";
	   //double value2 - Double.parseDouble(str1);
	   //System.out.println(value2);
	   
	   String str3 = "가나다";
	   int value2 = Integer.parseInt(str3);
	   System.out.println(str3);
	   
	   String str4 = String.valueOf(value2); //숫자를 문자열로 바뀔 수 있게 변환하는 작업 : valueof
	   System.out.println(String.valueOf(value2).getClass().getSimpleName());
	   
   }
}
