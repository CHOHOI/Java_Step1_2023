package Chapter03.If.For;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ� �Էµ� ����ŭ �� �����
		Scanner scan = new Scanner(System.in);
	
		System.out.println("������ �Է��ϼ���:");
		int n = scan.nextInt();
/*
		for (int i = 1; i <= num; i++) {
			for (int j = num-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		*/
		//��üȸ����
		for(int i=0; i<n; i++)
		{//����
			for(int j=0; j<=n-1-i; j++)
			{
				System.out.print(" ");
			}
			//��
			for(int j=0; j<2*i+1; j++)
			{
				System.out.print("��");
			}
			System.out.println();
		}
	}

}
