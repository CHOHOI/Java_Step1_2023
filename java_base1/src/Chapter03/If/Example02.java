package Chapter03.If;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// gender�� M�̸� �����Դϴ�. �׷��� ������ �����Դϴ�.
		char gender;
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		System.out.print("����:");
		gender = scan.nextLine().charAt(0);
		if (gender == 'M') {
			System.out.println("�����Դϴ�.");

		} else {
			System.out.println("�����Դϴ�.");
		}
		
		System.out.println("================================");
		System.out.println();
		System.out.println("�ֹ��Ͻðڽ��ϱ�?(Y,N)");
		
		char ch;		
		ch = scan.nextLine().charAt(0);
		//��,���ǿ� ���Լ� ���
		if (ch == 'Y' || ch== 'y') {
			System.out.print("�޴��� �Է��ϼ���:");
		String	menu = scan.nextLine();
		System.out.println(menu +"(��)�� �ֹ��Ǿ����ϴ�.");
		}
		else {
			System.out.println("�̿��� �ּż� �����մϴ�.");
		}
		
	}

}
