package Chapter03.If.While;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Java ������ ������ �Է��ϼ���:");
			int scr = scan.nextInt();

			// ������ 0�̸� �Ǵ� 100�ʰ��̸� while�� ����
			if (scr < 0 || scr > 100) {
				break;
			} else if (scr >= 60) {
				System.out.println("�հ��ϼ̽��ϴ�.");
			} else {
				System.out.println("���հ��ϼ̽��ϴ�.");
			} // if
		} // while
		System.out.println("���α׷� ����");
	}

}
