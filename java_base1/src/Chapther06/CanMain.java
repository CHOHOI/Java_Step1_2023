package Chapther06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		String select = "";
		int money =0;
		Scanner scan = new Scanner(System.in);
		Vending ven = new Vending();
		ven.init();//�����غ�
		
		
		System.out.println("���� �����ϼ��� : ");
		money = scan.nextInt();//������
		ven.showCans(money);
		
		System.out.println("���Ḧ �����ϼ��� : ");
		select = scan.next();//�������� ����
		ven.outCan(select);

	}

}
