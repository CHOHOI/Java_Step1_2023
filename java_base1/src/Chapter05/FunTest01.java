package Chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	//�հ� �޼ҵ� (�Լ�)
	//���� ������ : public(����:���Ѿ���)//protected(��Ű������ �����)/ private(Ŭ������������ ���)
	//void : return ����
	public static void sum(int num1,int num2) {
		//int num1 = 3;
		//int num2 = 5;
		int total=num1+num2;
		System.out.println(total);
	}
	
	
	//���� ����ϴ� �޼ҵ�
	public static void main(String[] args) {
		int a, b;
	a= Integer.parseInt(JOptionPane.showInputDialog("��1"));
	b= Integer.parseInt(JOptionPane.showInputDialog("��2"));
	//static���� ȣ����� �ʾ����Ƿ� Error �߻�
		sum(a,b);
	
	}
		
	//������ �������� �Ͽ� ���μ��� �� �Ǵ� �Ŀ� �����ص� ��
	/*
	public static void sum(int num1,int num2) {
		//int num1 = 3;
		//int num2 = 5;
		int total=num1+num2;
		System.out.println(total);
	}
	*/

}
