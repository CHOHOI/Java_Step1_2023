package Chapter03.If;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		// String -> int : Integer.parseInt(���ڿ��� �� ������ Int�� �ٲٴ� ��ɾ�)
		
		int dat;
		
		dat =Integer.parseInt(JOptionPane.showInputDialog("���� �Է��ϼ���"));  //���ڸ� ���� �Է��� �� ����ϴ� ��ɾ�
		
		//10����� �Ǵ��ϼ���
		//���� : dat�� �ִ� ���� 10���� ���� �������� 0�̳�?
		if (dat%10 == 0)
			System.out.println(dat +"(��)��10����Դϴ�");
		else
			System.out.println(dat +"(��)��10����� �ƴմϴ�");	
	}

}
