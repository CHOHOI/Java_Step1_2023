package Chapter06;

import java.util.Scanner;

public class GuguDanMain {

	public static void main(String[] args) {
		
		GuguDan gd = new GuguDan();
		
		int num;
		
		System.out.println("����� ���� �Է��ϼ��� : "); 
		Scanner scan = new Scanner(System.in);
		
		num=scan.nextInt();
		gd.showTable(num);

	}

}
