package Chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		//Scanner Ŭ������ �ν��Ͻ� ���� scan�� ���� �Է¹���
		//A,a -> ����� / B,b ->�Ϲ�ȸ�� /������ -> ��
		//CharAt(0) :String -> char
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �Է��ϼ���(A(a),B(b):");
		char grade;
		
		grade = scan.nextLine().charAt(0);
		
		//switch�� �Ǵ�
		
		switch(grade){
		case 'A' : case 'a' :
			System.out.println("������Դϴ�.");
			break;
		case 'B' : case 'b' :
			System.out.println("�Ϲݰ��Դϴ�.");
			break;
		default:
		
			System.out.println("���Դϴ�.");
			
			
		}

	}

}
