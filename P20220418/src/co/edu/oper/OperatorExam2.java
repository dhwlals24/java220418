package co.edu.oper;

public class OperatorExam2 {

	public static void main(String[] args) {
		
		
		//논리 부정 연산자 !
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
		
		int i =101;
		
		if(i <= 100) {
		  System.out.println("참입니다.");
	}   else {
          System.out.println("거짓입니다.");
	}
		
		String str = "서브웨이";
		if(str.equals("서브웨이")) {
		    System.out.println("맛있다.");
      } else {
	        System.out.println("별로다.");
      }
		
		
		int var = 6;
		
		if(var % 2 == 0 && var % 3 == 0) { //&& & 똑같은데, &두개는 처음에 F 나오면 뒤에것도 F로 바로 처리함
            System.out.println("2의 배수이면서, 3의 배수입니다.");	
      } else {
    	    System.out.println("2 그리고 3의 배수가 아닙니다.");
      }
		
		
		var = 9;
		if(var % 2 == 0 || var % 3 == 0) { //&& & 똑같은데, &두개는 처음에 F 나오면 뒤에것도 F로 바로 처리함
            System.out.println("2의 배수 또는 3의 배수입니다.");	
      } else {
    	    System.out.println("2 또는 3의 배수가 아닙니다.");
      }
		
		boolean flag1 = true; //true, false System.out.println(flag);
		if(!flag1) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		
		int score = 99;
		char grade = (score > 90) ? 'A' : 'B';
		
		System.out.println("학점은" + grade + "입니다.");
  }
}
