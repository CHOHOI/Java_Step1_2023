package Chapter03.If.For;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {
		//�Է¹��� ���� �ʰ��ϸ� �ݺ��� ���ߴ� ����
		Scanner scan= new Scanner(System.in);
		int i, sum=0;
		
		System.out.println("������ �Է��ϼ���:");
		int num=scan.nextInt();
		
		for(i=1;;i++) {
			if(sum >num) {
				break;
			}
			sum +=i;
		}
		System.out.println((i-1) + "��°������ ���� :"+ sum);

	}

}
