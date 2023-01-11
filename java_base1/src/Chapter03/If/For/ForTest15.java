package Chapter03.If.For;

import java.util.Scanner;

public class ForTest15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i , j;
		System.out.println("행을 입력하세요:");
		int a =scan.nextInt();
		System.out.println("열을 입력하세요:");
		int b =scan.nextInt();
		for (i=1 ; i<=a ; i++) {
			for(j=1;j <=b ; j++) {
				System.out.print(i*j+" ");
			}//안의 for 문
			System.out.println();
		}//밖의 for 문
	}

}
