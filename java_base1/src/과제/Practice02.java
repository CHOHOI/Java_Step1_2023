package ����;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Practice02 {

	public static void main(String[] args) {
		// Scanner scan �̶�� �ν��Ͻ� ���� ����
		Scanner scan = new Scanner(System.in);
		// ID��� ������ ���̵� �ޱ�
		System.out.print("���̵�:");
		String ID = scan.nextLine();
		// PW��� ������ ��� �ޱ�(String) => ���ڷ� �޵� String
		System.out.print("��й�ȣ:");
		String PW = scan.nextLine();
		// int������ ����ȯ
		// int PW= Integer.parseInt(scan.nextLine()); =�����ڵ�
		int pass = Integer.parseInt(PW);
		/*
		//��÷���Ǹ� ����Ͽ� �α��� ������ ��й�ȣ �ٸ�, ���̵� ����
		if (ID.equals("soldesk")) {
			if (pass == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			} // in if
		} else {
			System.out.println("�α��� ����");
		} // out if
       */
		// �� ������
		if(ID.equals("soldesk") && pass == 12345) {
			System.out.println("�α��ο� �����Ͽ����ϴ�");
		}
	else 
			System.out.println("�α��ο� �����Ͽ����ϴ�");
		
		

	}// main

}// class
