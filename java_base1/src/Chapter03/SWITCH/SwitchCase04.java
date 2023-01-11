package Chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		//Scanner 클래스의 인스턴스 변수 scan에 값을 입력받음
		//A,a -> 우수고객 / B,b ->일반회원 /나머지 -> 고객
		//CharAt(0) :String -> char
		
		Scanner scan = new Scanner(System.in);
		System.out.println("등급을 입력하세요(A(a),B(b):");
		char grade;
		
		grade = scan.nextLine().charAt(0);
		
		//switch로 판단
		
		switch(grade){
		case 'A' : case 'a' :
			System.out.println("우수고객입니다.");
			break;
		case 'B' : case 'b' :
			System.out.println("일반고객입니다.");
			break;
		default:
		
			System.out.println("고객입니다.");
			
			
		}

	}

}
