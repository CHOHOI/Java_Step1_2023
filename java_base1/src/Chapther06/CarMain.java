package Chapther06;

public class CarMain {

	public static void main(String[] args) {
		
		Car obj = new Car();
		
		System.out.println("| �� : " +obj.model);
		System.out.println( "| ����: " + obj.color);
		System.out.println("| �ְ�ӵ� : "+ obj.maxSpeed);
		System.out.println("| ���� �ӵ� : "+ obj.speed);
		System.out.println("=============================");
		obj.speed = 60;
		System.out.println("����� ���� �ӵ� : " + obj.speed);
	
		
	}

}
