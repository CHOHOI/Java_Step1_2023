package Chapter03.If;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		//����ó������� �� ������ ���䰳���� int�� Ÿ���� ���� 5���� �����ϰ� �Է¹������� (�� �Է��� Scanner Ŭ���� ���)
		//����Ʈ���� ����(soft1), ����Ʈ���� ����(soft2), �����ͺ��̽� ����(DB), ���α׷��־��Ȱ��(PRO),�����ý��� ����(os)
		//�� �����̶� 8�� �̸�, ��ü������(sum)�� 60�� �̸��� ��� ���հ��Դϴٷ� ���
		//�׷��� ������ �հ��Դϴ�.
		Scanner scan = new Scanner(System.in);
		System.out.println("����Ʈ���� ����:");
		String inputsoft1 = scan.nextLine();
		int soft1 = Integer.parseInt(inputsoft1);
		System.out.println("����Ʈ���� ����:");
		String inputsoft2 = scan.nextLine();
		int soft2 = Integer.parseInt(inputsoft2);
		System.out.println("�����ͺ��̽� ����:");
		String inputDB = scan.nextLine();
		int DB = Integer.parseInt(inputDB);
		System.out.println("���α׷��־��Ȱ��:");
		String inputPRO = scan.nextLine();
		int PRO = Integer.parseInt(inputPRO);
		System.out.println("�����ý��� ����:");
		String inputOS = scan.nextLine();
		int OS = Integer.parseInt(inputOS);
		int SUM = soft1 + soft2 + DB + PRO + OS;
		if (soft1 > 8 && soft2 > 8 && DB > 8 && PRO > 8 && OS > 8) {
			if (SUM > 60) {
				System.out.println("�հ��Դϴ�.");
			} else
				System.out.println("���հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

		// �Է��� Scanner
	}

}
