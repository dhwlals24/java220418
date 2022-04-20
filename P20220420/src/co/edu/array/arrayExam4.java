package co.edu.array;

public class arrayExam4 {

	public static void main(String[] args) {
		
//        int[][] ary = {{1,2},{2,3},{3,4},{4,5},{5,6}};
//		
//		for(int i=0; i<ary.length; i++) {
//			for(int j=0; j<ary[i].length; j++) {
//				System.out.println(ary[i][j] + " ");
//			}
//		    System.out.println();
//		}
//        
		
		//2차원 배열 : 배열 안에 또 배열이 존재
		int[][] ary1 = new int[5][5];
		//2차원 배열 데이터 입력
		int num =1;
		for(int i=0; i<ary1.length; i++) { //배열 안에 공간이 몇개인지 중요, 첫번째 length는 공간 5개 의미 (0층~4층)
			for(int j=0; j<ary1[i].length; j++) { //첫번째 length의 배열 5개 안에 각각 있는 공간 5개 의미 (0층 1호~5호)
				ary1[i][j] += num;
				num++;
			}
		}
		
//		//2차원 배열 데이터 출력
//		for(int i=0; i<ary1.length; i++) {
//			for(int j=0; j<ary1[i].length; j++) {
//				System.out.print(ary1[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
//		//순서 세로로 바꾸기
//		for(int i=0; i<ary1.length; i++) {
//			for(int j=0; j<ary1[i].length; j++) {
//				System.out.print(ary1[j][i] + " ");
//			}
//			System.out.println();
//		}
		
		
		//순서 세로에 역순으로 바꾸기
		for(int i=4; i>ary1.length; i--) {
			for(int j=4; j>ary1[i].length; j--) {
				System.out.print(ary1[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
