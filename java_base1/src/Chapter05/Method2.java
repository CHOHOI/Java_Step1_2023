package Chapter05;

import java.util.Scanner;

public class Method2 {
	int cnt, num;
	boolean run = true;
	String str = "";
	Method br = new Method();
	
	Scanner scan = new Scanner(System.in);
	
	public  Method2() {
		
	}
	void order() {
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>>");

			num = scan.nextInt();

			switch (num) {
			case 1:
				br.makeBread(cnt);
				break;
			case 2:
				System.out.println("�ֹ��� ���� ����: ");
				int cnt2 = scan.nextInt();
				System.out.println("�ֹ��� ���� ����: ");
				String name= scan.next();
				br.makeBread(cnt, name);
				break;
			default:
				System.out.println("�߸��� ��ȣ �Դϴ�.");
			}//switch
		}//while
	}//main
}//class
