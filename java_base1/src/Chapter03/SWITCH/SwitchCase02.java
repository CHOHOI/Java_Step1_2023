package Chapter03.SWITCH;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		// 1:������ȸ 2:��� 3:�Ա� 4:�۱� �׿�: ��ȣ�� �߸� �Է��Ͽ����ϴ�.

		int num;

		num = Integer.parseInt(JOptionPane.showInputDialog("��ȣ�� �Է��ϼ���"));

		switch (num) {
		case 1:
			System.out.println("������ȸ");
			break;
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("�Ա�");
			break;
		case 4:
			System.out.println("�۱�");
			break;
		default:
			System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");

		}

	}

}
