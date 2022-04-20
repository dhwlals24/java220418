package co.edu.oop;

public class CalMain {

	public static void main(String[] args) {
		
		 Calculator cal = new Calculator();
		 
		 cal.x = 5;
		 cal.y = 2;
		 
		 cal.plus(10, 2);
		 cal.minus(100, 40);
		 cal.multi(10, 20);
		 cal.div(45,9);
		 
		 
		 
		 Car car = new Car(); //g바겐 데이터없는 객체 만듦
		 int value = 1; // 데이터 넣어주면서 객체 만듦
		 
		 Car car2 = new Car(); //소나타
		 
		 car.model = "G바겐";
		 car.color = "white";
		 car.price = 300000000;
		 car.info();
		 
		 car2.model = "소나타";
		 car2.color = "gray";
		 car2.price = 30000000;
		 car2.info();
		 
		 
		 Car car3 = new Car("black", "그랜저", 200); //생성자를 통해서 처음에 3개의 데이터를 넣어주는 방법
		 car3.info();

	}

}
