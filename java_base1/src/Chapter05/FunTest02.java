package Chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {

	
		public static void sum(int num1,int num2) {
			//int num1 = 3;
			//int num2 = 5;
			int total=num1+num2;
			System.out.println("num1" + "+" + "num2=" + total);
		}
		
		
		//���� ����ϴ� �޼ҵ�
		public static void main(String[] args) {
			int a, b;
		a= Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b= Integer.parseInt(JOptionPane.showInputDialog("��2"));
		//static���� ȣ����� �ʾ����Ƿ� Error �߻�
			//sum(a,b);
		FunTest02 obj = new FunTest02();
		obj.sum(a, b);
		
		}

	

}
