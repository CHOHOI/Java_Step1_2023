package Chapter03.If;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		//정보처리기사의 각 과목의 정답개수를 int형 타입의 변수 5개를 선언하고 입력받으세요 (단 입력은 Scanner 클래스 사용)
		//소프트웨어 설계(soft1), 소프트웨어 개발(soft2), 데이터베이스 구축(DB), 프로그래밍언어활용(PRO),정보시스템 구축(os)
		//한 과목이라도 8개 미만, 전체갯수가(sum)이 60개 미만인 경우 불합격입니다로 출력
		//그렇지 않으면 합격입니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("소프트웨어 설계:");
		String inputsoft1 = scan.nextLine();
		int soft1 = Integer.parseInt(inputsoft1);
		System.out.println("소프트웨어 개발:");
		String inputsoft2 = scan.nextLine();
		int soft2 = Integer.parseInt(inputsoft2);
		System.out.println("데이터베이스 구축:");
		String inputDB = scan.nextLine();
		int DB = Integer.parseInt(inputDB);
		System.out.println("프로그래밍언어활용:");
		String inputPRO = scan.nextLine();
		int PRO = Integer.parseInt(inputPRO);
		System.out.println("정보시스템 구축:");
		String inputOS = scan.nextLine();
		int OS = Integer.parseInt(inputOS);
		int SUM = soft1 + soft2 + DB + PRO + OS;
		if (soft1 > 8 && soft2 > 8 && DB > 8 && PRO > 8 && OS > 8) {
			if (SUM > 60) {
				System.out.println("합격입니다.");
			} else
				System.out.println("불합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		// 입력은 Scanner
	}

}
