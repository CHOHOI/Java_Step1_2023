package Chapter03.If.While;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		/*
		boolean run=true;
		int num, num2, i;
		int save=0 , money;
		Scanner scan =new Scanner(System.in);
		*/
		/*
		while(run) {
			System.out.println("============================");
			System.out.print("1.예금 |2.출금 |3.잔고 |4.종료"  );
			System.out.println();
			System.out.println("============================");
			System.out.print("선택>");
			*/
			/*
			int i = scan.nextInt();
			if(i == 1) {
				System.out.print("예금액 :");
				 a = scan.nextInt();
			}else if (i ==2) {
				System.out.print("출금액 :");
				 b = scan.nextInt();
			}else if(i == 3) {
				System.out.println("잔고 :"+ (a-b));
			}//if
			
			if(i == 4) {
				System.out.print("거래가 종료 되었습니다.");
				break;
			}
			*/
			/*
			int menuNum = Integer.parseInt(scan.nextLine());
			switch(menuNum) {
			case 1://0이하의 금액이 입력되었을 때 예외처리
				System.out.print("예금액>");
				balance += Integer.parseInt(scan.nextLine());
				if(balance == 0) {
					System.out.println("다시 입금해주세요");
				}
				break;
			case 2://잔액이 부족합니다.
				System.out.print("출금액>");
				balance -= Integer.parseInt(scan.nextLine());
				
				if(balance < 0) {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;//switch
				
			}
			*/
		boolean run = true;

		int balance = 0;
		int num, num2,i;
		int save=0;
		int money;
		
		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			num = scan.nextInt();
			
			if(num==1) {
				System.out.println("예금을 선택하셨습니다");
				System.out.println("현재 금액 : "+save);
				System.out.print("입금할 금액을 입력하세요 : ");
				money=scan.nextInt();
				save+=money;
				if(money <=0) 
					System.out.println("금액을 잘못 입력하셨습니다");
				}else if(num==2) {
					System.out.println("출금을 선택하셨습니다");
					System.out.println("현재 금액 : "+save);
					System.out.print("출금할 금액을 입력하세요 : ");
					money=scan.nextInt();
					save -=money;//save=save-money;
					if(save<0) {
						System.out.println("잔액이 부족합니다");
						save +=money;//잔액이 부족하므로 출금시도했던 금액을 다시 입금
					}
				}else if (num==3) {
					System.out.println("잔액확인을 선택하셨습니다");
					System.out.println("현재 금액 : "+save);
				}else if(num==4) {
					System.out.println("종료를 선택하셨습니다");
					run=false;
				}else {
					System.out.println("잘못된 서비스 번호를 선택하셨습니다");
				}//if

			System.out.println("1.초기메뉴 2.종료");
			num2=scan.nextInt();
			
			if(num2==2) {
				run=false;
			}
			} //while
		}

	}
