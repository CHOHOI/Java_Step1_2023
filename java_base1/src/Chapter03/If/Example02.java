package Chapter03.If;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// gender가 M이면 남성입니다. 그렇지 않으면 여성입니다.
		char gender;
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요");
		System.out.print("성별:");
		gender = scan.nextLine().charAt(0);
		if (gender == 'M') {
			System.out.println("남성입니다.");

		} else {
			System.out.println("여성입니다.");
		}
		
		System.out.println("================================");
		System.out.println();
		System.out.println("주문하시겠습니까?(Y,N)");
		
		char ch;		
		ch = scan.nextLine().charAt(0);
		//단,조건에 논리함수 사용
		if (ch == 'Y' || ch== 'y') {
			System.out.print("메뉴를 입력하세요:");
		String	menu = scan.nextLine();
		System.out.println(menu +"(가)이 주문되었습니다.");
		}
		else {
			System.out.println("이용해 주셔서 감사합니다.");
		}
		
	}

}
