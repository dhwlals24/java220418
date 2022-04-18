package co.yedam.var;

public class variableExample2 {

	public static void main(String[] args) {
		
		/*자동타입변환
		byte a = 10;
		int b = a;
		long c= b;
		
		byte d = 10;
		char f = d; char는 0부터 양수가 범위이기 때문에 음수 포함되는 바이트를 못 포함시킴 */
		
		
		
		//강제타입변환
		int intValue = 44032;
		char charValue = (char)intValue;
		
		int intValue1 = 10; //1byte 127까지 표현가능
		byte byteValue = (byte)intValue1;
		
		System.out.println(byteValue);
		
	}

}
