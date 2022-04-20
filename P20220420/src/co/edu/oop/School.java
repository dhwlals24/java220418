package co.edu.oop;

public class School {

	public static void main(String[] args) {
		
		Student std = new Student(); //객체 만드는 과정. class타입은 new연산자를 통해 초기화. 학생 한 명 생성
		
		std.name ="고길동";
		std.age = 20;
		std.getInfo();
		
		int value = 1;

	}

}
