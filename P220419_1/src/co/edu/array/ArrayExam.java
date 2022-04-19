package co.edu.array;

public class ArrayExam {

	public static void main(String[] args) {
           
		//int[] ary = new int[10]; //10개 데이터 들어갈 공간 만듦. 데이터 안 넣고 배열만 만듦
		
		  //인덱스 값 : 0 1 2 3 4 (위치)
		/* int[] ary1 = {1,2,3,4,5}; //데이터 넣음과 동시에 공간이 만들어짐. 데이터 5개 넣은 int만듦.
		int sum = 0;
		for(int i=0; i<ary1.length; i++) { //length는 공간의 크기, 칸 수. 배열의공간은 5칸. 
			  //i=0은 0부터 시작하는 첫번째 공간부터 불러오기 위함
			sum += ary1[i]; //배열에 있는 데이터 불러옴
		}
		System.out.println("총합 : " + sum); */
		
		
		
		//3칸짜리 int타입 배열
		int[] scores = {83, 90, 87};
		              // 0   1   2
		
		System.out.println(scores[0]); //scores 배열 첫번째 데이터
		System.out.println(scores[1]); //scores 배열 두번째 데이터
		System.out.println(scores[2]); //scores 배열 세번째 데이터
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i]; // <-여기에 0 1 2 들어옴
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum /3;
		System.out.println("평균 : " + avg);
		
		
		
		//최대 최소값 구하기
		int[] ary2 = {235,411,119,63,325};
		int max =0; //최대값은 제일 큰거 구하는거라 0을 넣으면 뭐든지 0보다 큼
		int min = ary2[0]; //최소값 구할때는 0이 최소값이기 때문에 안됨. 제일 첫번째 데이터를 넣어서 나머지 뒤에꺼 다 비교시켜야됨.
		for(int i=0; i<ary2.length; i++) {
			if(max < ary2[i]) {
				max = ary2[i];
			}
			
			if(min < ary2[i]) {
				min = ary2[i];
			}
		}
		
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		
		
		//내림차순 5 4 3 2 1 정렬
		//데이터 비교해서 값 바꾸기
		
		
	}

}
