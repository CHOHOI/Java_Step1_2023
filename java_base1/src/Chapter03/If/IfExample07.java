package Chapter03.If;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {

		int num1, num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("��1:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("��2:"));

		// num1�� ũ�� num1�� Ů�ϴ�
		// num2�� ũ�� num2�� Ů�ϴ�
		// �� �ۿ��� �����ϴ�.
		if (num1 > num2) {
			System.out.println("num1�� num2 ���� Ů�ϴ�.");
		}else if (num2 > num1) {
			System.out.println("num2�� num1 ���� Ů�ϴ�.");
		}else
			System.out.println("num1�� num2�� ���� �����ϴ�. ");
	}

}