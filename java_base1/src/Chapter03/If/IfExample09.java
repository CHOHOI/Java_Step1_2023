package Chapter03.If;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class IfExample09 {

	public static void main(String[] args) {
		//������ ���̽�
		String ID = "soldesk";
		int PW = 221227;
		
		//Scanner scan
		Scanner scan = new Scanner(System.in);
		//ID �ޱ�
		System.out.print("���̵�:");
		String inputID=scan.nextLine();
				
		if(ID.equals(inputID)) {
			//����Է� �ް�
			System.out.print("��й�ȣ:");
			String inputPW = scan.nextLine();
			/*
			String PW = scan.nextLine();
			int pass = Integer.parseInt(PW);
			
			if (pass == 221227) {
				System.out.println("�α��ο� �����Ͽ����ϴ�");
				
			if(PW == Integer.parseInt(inputPW))
			}else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
			}
			*/
			//���Ȯ��
			if( PW == Integer.parseInt(inputPW)) {
				System.out.println("�α��ο� �����Ͽ����ϴ�");
			}else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
			}
		}else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�");
		}

	}

}
