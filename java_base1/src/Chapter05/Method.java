package Chapter05;

import java.util.Scanner;

public class Method {
	//멤버 변수(=필드)
	
	//생성자 생략
	
	//메소드
	
	void makeBread( ) {
		System.out.println("빵을 만듭니다.");
	}//method1
	void makeBread(int count) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		//....
		//요청하신 5개의 빵이 모두 완료되었습니다.
		for(int i=0; i <count; i++) {
		System.out.println((i+1)+" 번째빵을 만듭니다.");
		
		}
		System.out.println("요청하신 " +count + "개의 빵이 모두 완료되었습니다.");
	}//method2
	void makeBread(int count,String bread) {
		//1번째 빵을 만들었습니다
		//2번째 빵을 만들었습니다
		for(int i=0; i <count; i++) {
		System.out.println((i+1) +"번째 "+ bread +"빵을 만듭니다.");
		
		}
		System.out.println("요청하신 " +count + "개의 " + bread + "빵이 모두 완료되었습니다.");
	}//method3
	
	void order() {
		boolean run = true ;
		int num,cnt, a=0 ;
		
		while(run) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료");
			System.out.print("선택>");
	
			 num = scan.nextInt();
			if(num==1) {
				System.out.print("주문할 빵의 갯수: ");
				 a = scan.nextInt();
				if(a<0) {
					System.out.println("번호를 다시 입력해주세요");
				}
			}else if(num==2) {
				System.out.println("주문할 빵의 갯수: " + a);
				System.out.print("주문할 빵의 종류 :");
				String b = scan.next();
				for(int i=0; i<a;i++) {
					System.out.println((i+1) +"번째 "+ b +"빵을 만듭니다.");				
				}//for
				System.out.println("요청하신 " + a + "개의 " + b + "빵이 모두 완료되었습니다.");	
			}else if(num == 3) {
				System.out.println("프로그램 종료");
				run =false;
			}else {
				System.out.println("번호를 잘못입력하였습니다.");
			}
			
		
		}//while
			
			
	
	}//void
}//class
