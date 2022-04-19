package co.edu.reference;

public class reference {

	public static void main(String[] args) {
		
		int[] ary1 = {1,2,3};
		System.out.println(ary1);
        
		//참조타입 기본 원리
		String a = "자바"; //string은 데이터 자체가 아니라 자바가 갖고있는 번지수가 들어감
		String b = "자바";  // 둘다 같은 자바이기 때문에 같은 주소를 갖고 있음
		if(a==b) { //둘이 갖고 있는 번지수 주소가 같은지를 비교
			System.out.println("a");
		}
		if (a.equals(b)) { //.equal은 데이터를 비교할 때 씀
			System.out.println("b");
		}
	}

}
