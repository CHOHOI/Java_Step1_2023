package Chapter03.If.For;

import java.util.Scanner;

public class ForTest13 {

	public static void main(String[] args) {
		// ������
	/*	
		for(int i =2 ; i<10; i++) {
			for(int j=1; j<10 ; j++) {//i=2 ->j=1~9
				System.out.println(i + "*"+ "="+(i*j));
			}//���� for
			System.out.println("============================");
		}//���� for
		*/
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���:");
		int num = scan.nextInt();
		
		for(i=1; i<10 ; i ++) {
			System.out.println(num + "*" + i +"=" +(num*i));
		}
		
	}//main

}//class
