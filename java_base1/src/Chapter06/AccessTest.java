package Chapter06;

import java.util.Scanner;

public class AccessTest {
	
	//�ʵ�
	private int aa;
	public int bb;
	int cc;
	
	//����Ʈ ������
	
	//�޼���
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	public void Disp() {
		System.out.println("aa�� : " + aa + "\nbb��: "+ bb + "\ncc��: " + cc);
	}
	
	
	
	public static void main(String[] args) {
		
			AccessTest obj = new AccessTest();
			Scanner scan = new Scanner(System.in);
			System.out.print("aa �����Է�: ");
			obj.aa= scan.nextInt();
			//obj.setAa(10);
			System.out.print("bb �����Է�: ");
			obj.bb= scan.nextInt();
			System.out.print("cc �����Է�: ");
			obj.cc= scan.nextInt();
			
			obj.Disp();



}
}
	
