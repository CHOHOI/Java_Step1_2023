package Chapter05;

import java.util.Scanner;

public class Method {
	//��� ����(=�ʵ�)
	
	//������ ����
	
	//�޼ҵ�
	
	void makeBread( ) {
		System.out.println("���� ����ϴ�.");
	}//method1
	void makeBread(int count) {
		//1��° ���� ��������ϴ�
		//2��° ���� ��������ϴ�
		//....
		//��û�Ͻ� 5���� ���� ��� �Ϸ�Ǿ����ϴ�.
		for(int i=0; i <count; i++) {
		System.out.println((i+1)+" ��°���� ����ϴ�.");
		
		}
		System.out.println("��û�Ͻ� " +count + "���� ���� ��� �Ϸ�Ǿ����ϴ�.");
	}//method2
	void makeBread(int count,String bread) {
		//1��° ���� ��������ϴ�
		//2��° ���� ��������ϴ�
		for(int i=0; i <count; i++) {
		System.out.println((i+1) +"��° "+ bread +"���� ����ϴ�.");
		
		}
		System.out.println("��û�Ͻ� " +count + "���� " + bread + "���� ��� �Ϸ�Ǿ����ϴ�.");
	}//method3
	
	void order() {
		boolean run = true ;
		int num,cnt, a=0 ;
		
		while(run) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. �� ���� ���� | 2. ���� ������ ���� | 3. ����");
			System.out.print("����>");
	
			 num = scan.nextInt();
			if(num==1) {
				System.out.print("�ֹ��� ���� ����: ");
				 a = scan.nextInt();
				if(a<0) {
					System.out.println("��ȣ�� �ٽ� �Է����ּ���");
				}
			}else if(num==2) {
				System.out.println("�ֹ��� ���� ����: " + a);
				System.out.print("�ֹ��� ���� ���� :");
				String b = scan.next();
				for(int i=0; i<a;i++) {
					System.out.println((i+1) +"��° "+ b +"���� ����ϴ�.");				
				}//for
				System.out.println("��û�Ͻ� " + a + "���� " + b + "���� ��� �Ϸ�Ǿ����ϴ�.");	
			}else if(num == 3) {
				System.out.println("���α׷� ����");
				run =false;
			}else {
				System.out.println("��ȣ�� �߸��Է��Ͽ����ϴ�.");
			}
			
		
		}//while
			
			
	
	}//void
}//class
