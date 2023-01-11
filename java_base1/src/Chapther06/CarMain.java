package Chapther06;

public class CarMain {

	public static void main(String[] args) {
		
		Car obj = new Car();
		
		System.out.println("| 모델 : " +obj.model);
		System.out.println( "| 색상: " + obj.color);
		System.out.println("| 최고속도 : "+ obj.maxSpeed);
		System.out.println("| 현재 속도 : "+ obj.speed);
		System.out.println("=============================");
		obj.speed = 60;
		System.out.println("변경된 현재 속도 : " + obj.speed);
	
		
	}

}
