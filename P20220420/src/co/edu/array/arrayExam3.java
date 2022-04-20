package co.edu.array;

import java.util.Scanner;

public class arrayExam3 {

	public static void main(String[] args) {
		
		//1. 1~100까지 데이터를 넣은 배열에서 3의 배수만 출력
//		Scanner sc = new Scanner(System.in);
//		int[] ary2 = null; 
//		System.out.println("배열의 사이즈를 입력하세요.");
//		int num = sc.nextInt();
//		ary2 = new int[num];
//		
//		for(int i=0; i<ary2.length; i++) {
//			ary2[i] = i+1; 
//		}
//		
//		for(int i=0; i<ary2.length; i++) {
//			 if(ary2[i] % 3 == 0) {
		        
//				 System.out.println("3의 배수 : " + ary2[i]);
		        //2. 위에서 만든 배열에서 짝수만 출력
//		         if(ary2[i] % 2 == 0) {
//			     System.out.println("짝수 : " + ary2[i]);
//		
//			 }
//		}
//		
	
			 
	    
		//답안 : 1~100까지 데이터를 넣은 배열에서 3의 배수, 그중 짝수 출력
		int[] ary = new int[100];
		for(int i=1; i<= ary.length; i++) {
			ary[i-1] = i;
		}
		for(int i=0; i<ary.length; i++) {
			if(ary[i] % 3 == 0) {
				
				System.out.println("3의 배수 : " + ary[i]);
				if(ary[i] % 2 == 0) {
					System.out.println("짝수 : " + ary[i]);
				}
			}
		}
		
		
		
		
		
			 
		}

	}


