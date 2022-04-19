package co.edu.condition;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		System.out.println("화씨를 입력하면 섭씨로 변환 : ");

		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		double c = 5.0 / 9.0 * (f - 32);

		System.out.println((c) + "도씨");

	}




		
}
}

