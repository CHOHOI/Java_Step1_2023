package Chapter03.If.For;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★ ⓐ출력
		Scanner scan = new Scanner(System.in);
	
		System.out.println("정수를 입력하세요:");
		int n = scan.nextInt();
/*
		for (int i = 1; i <= num; i++) {
			for (int j = num-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		*/
		//전체회전수
		for(int i=0; i<n; i++)
		{//공백
			for(int j=0; j<=n-1-i; j++)
			{
				System.out.print(" ");
			}
			//별
			for(int j=0; j<2*i+1; j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
