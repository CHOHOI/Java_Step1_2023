package Chapter03.If.For;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		
		// ������ �Է¹޾� �Է¹��� �������� 100������ ��
//Q1		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("������ �Է��ϼ��� :");
		int num = scan.nextInt();		
		int i;
		int total =0;
		for(i = 0 ; i <= 100; i++) {
			if(num <= i )
				total += i;
				
		}
		System.out.println(num + "���� 100������ ��:" + total);
		*/
//Q2 1 ���� 10���� �ݺ��ϸ鼭 ������ �Է¹޾� �� ���߿� ¦���� ������ ����� ���
	//�� �Է¹��� ���� 0�̸� ����
	System.out.println("������ �Է��ϼ���:");

	int num, j, cnt = 0;
	
	
	for(j=1; j <= 10; j++ ) {
		int num2=scan.nextInt();
		
		if(num2==0) {
			continue;
		}
		if(num2 % 2 == 0) {
			cnt ++;
		}
		
	}
	System.out.println("¦���� ����"+cnt);
			
		
		
		
		
		
		

	}

}
