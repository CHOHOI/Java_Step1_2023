package Chapter03.If;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample08 {

	public static void main(String[] args) {

		String ID = "soldesk"; // �ν��Ͻ� ����
		int PW = 221227; // ������ ����

		// ��
		String id = JOptionPane.showInputDialog("���̵�");
		int pass = Integer.parseInt(JOptionPane.showInputDialog("��й�ȣ"));

		if (id == ID) {
			if (PW == pass) {
				System.out.println("�α��ο� �����Ͽ����ϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			}
		} 
		else 
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�");
		

	}// ����
}// Ŭ����
