package Chapter05;

import java.util.Scanner;

public class FunTest07 {
	
	public FunTest07() {
		
	}
	/*
	public static String  Edustep(int edu) {
		String step;
		
		if(edu==1) {
			step = "1�ܰ�";
		}//if
		else if (edu == 2 ) {
			step = "2�ܰ�";
		}//else if
		else if (edu == 3 ) {
			step = "3�ܰ�";
		}//else if
		else {
			step = "�ش��ϴ� ���͵�ܰ谡 �����ϴ�.";
			
		}
		
		return step;
	}//�޼ҵ�
	*/
	public static void Edustep(int edu) {
		
		
		if(edu==1) {
			System.out.println("���� ���� �ܰ�� step"+edu+"�Դϴ�.");
		}//if
		else if (edu == 2 ) {
			System.out.println("���� ���� �ܰ�� step"+edu+"�Դϴ�.");
		}//else if
		else if (edu == 3 ) {
			System.out.println("���� ���� �ܰ�� step"+edu+"�Դϴ�.");
		}//else if
		else {
			System.out.println("�ش��ϴ� ���͵�ܰ谡 �����ϴ�.");
			
		}
		
		
	}//�޼ҵ�
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("���͵� �ܰ踦 �Է��ϼ���");
		int number= scan.nextInt();
		//return ���� ���� ���
		//String step = Edustep(number);
		//System.out.println("���� ���� �ܰ�� :" + step + "�Դϴ�.");
		//System.out.println("���� ���� �ܰ�� :" + Edustep(number) + "�Դϴ�.");
		Edustep(number);
	}//main

}//class
