package Chapter03.If.For;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ� �Էµ� ����ŭ �� ���
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���:");
		int i, j ;
		int n = scan.nextInt();
		for(i=1; i<=n ; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("��");
			}
		System.out.println();
		}
	}

}
