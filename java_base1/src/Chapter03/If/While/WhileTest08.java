package Chapter03.If.While;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		String menu = "";
		while(true) {
			System.out.print("1.�Է��ϱ�\n2.����ϱ�\n3.�����ϱ�\n4.������\n �۾��� ��ȣ�� ������ �ּ��� >");
			num =scan.nextInt();
			System.out.println();
			switch(num) {
			case 1: {
				System.out.println("1.�Է��ϱ⸦ �����Ͽ����ϴ�");
				break;
			}
			case 2:{
				System.out.println("2.����ϱ⸦ �����Ͽ����ϴ�");
				break;
			}
			case 3:{
				System.out.println("3.�����ϱ⸦ �����Ͽ����ϴ�");
				break;
			}
			case 4:{
				System.out.println("4.�����⸦ �����Ͽ����ϴ�");
				break;
			}
			default :{
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
			
			}//switch
			if(num ==4) {
				break;
			}
		}//while

	}

}
