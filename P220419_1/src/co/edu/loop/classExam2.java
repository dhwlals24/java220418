package co.edu.loop;

public class classExam2 {

	public static void main(String[] args) {
		//1. 최소, 최대값 구하기 scanner -> 데이터 3개 안에서 최대값 최소값 구해보는 반복문
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println();
		
		
		//2. 두 주사위를 던졌을 때 주사위 합이 6인 데이터 출력, 두 주사위 -> random함수 데이터 2개 -> 합이 6
		
		
		
		for(int i=0; i<=100; i++) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			
			if (num1 + num2 == 6) {
				    System.out.println( num1 + "+" + num2 + "= 6");	
			}
		}
		

		
		
		//3. 피보나치 수열 : 1,2,3,5,8,13 while사용, 
		
		
		
		
		/*선생님 답안 1. 최소, 최대 값 구하기... scanner -> 3개 
				// 최대값, 최소값
				Scanner sc = new Scanner(System.in);
				int first, second, third, max, min;		
				
				System.out.println("데이터 입력 1");
				first = sc.nextInt();
				System.out.println("데이터 입력 2");
				second = sc.nextInt();
				System.out.println("데이터 입력 3");
				third = sc.nextInt();
				
				max = first;
				//min구하는거.
					if(max < second) {
						max = second;
					}
					if(max < third) {
						max = third;
					}
				
				//2. 두 주사위를 던졌을때 주사위 합이 6인 데이터 출력
				// 두 주사위 => random 데이터 2개 => 합이 6
				// 
					
					for(int i = 0; i<=100; i++) {
						int randomValue = (int)(Math.random() * 6) + 1;
						int randomValue2 = (int)(Math.random() * 6) + 1;
						if(randomValue + randomValue2 == 6) {
							System.out.println("주사위 : "+randomValue + "," + randomValue2 + " = " +(randomValue+randomValue2));
						}
					}
				//3. 피보나치 수열(while(value <50))
				// 예시) 1, 2, 3, 5, 8, 13, 21, 33, 54
					int num1 = 1;
					int num2 = 2;
					int num3 = 0;
					while(num3 < 50) {
						
						num3 = num1 + num2;				

						System.out.println(num1 +"," + num2 +" = " + num3);
						
						num1 = num2;
						
						num2 = num3;
					} */
		

		
		
		
	}

}
