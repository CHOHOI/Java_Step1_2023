package Chapter03.If.For;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		
		// 정수를 입력받아 입력받은 정수부터 100까지의 합
//Q1		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("정수를 입력하세요 :");
		int num = scan.nextInt();		
		int i;
		int total =0;
		for(i = 0 ; i <= 100; i++) {
			if(num <= i )
				total += i;
				
		}
		System.out.println(num + "부터 100까지의 합:" + total);
		*/
//Q2 1 부터 10까지 반복하면서 정수를 입력받아 그 수중에 짝수의 갯수가 몇개인지 출력
	//단 입력받은 수가 0이면 무시
	System.out.println("정수를 입력하세요:");

	int num, j, cnt = 0;
	
	
	for(j=1; j <= 10; j++ ) {
		int num2=scan.nextInt();
		
		if(num2==0) {
			continue;
		}
		if(num2 % 2 == 0) {
			cnt ++;
		}
		
	}
	System.out.println("짝수의 갯수"+cnt);
			
		
		
		
		
		
		

	}

}
