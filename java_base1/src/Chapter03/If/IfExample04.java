package Chapter03.If;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		// ���ð��� ������ ������ �Ƶ��� 1000��
		// ���ð��� ������ �ʵ��л��� 2000��
		// ���ð��� ������ �ߣ�����л��� 3500��
		// ���ð��� ������ ���л��� 5000��

		int age;
		int charge;
		// swing ����Ͽ� �Է� �ޱ�
		age = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));

		// if ������
		if (age>0 && age <8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�");
		} else if (age>=8 && age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�");
		} else if (age >= 14 &&  age < 20) {
			charge = 3500;
			System.out.println("�ߣ�����л� �Դϴ�");
		} else {
			charge = 5000;
			System.out.println("�����Դϴ�");

		}

		System.out.println("������" + charge + "���Դϴ�");

	}

}
