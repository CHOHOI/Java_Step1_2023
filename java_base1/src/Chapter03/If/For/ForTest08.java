package Chapter03.If.For;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시오
		Scanner scan = new Scanner(System.in);
		int a, b, cnt3 = 0, cnt5 = 0;
		System.out.println("정수를 입력하세요:");
		for (a = 0; a <= 10; a++) {
			b = scan.nextInt();
			if (b == 0) {
				continue;
			}
			if (b % 3 == 0) {
				System.out.println("3의 배수:" +a);
				cnt3 ++;
				
				}

			if ( b % 5 == 0) {
				System.out.println("5의 배수:" + b);
				cnt5 ++;
			}
		}// for
	}

	}


