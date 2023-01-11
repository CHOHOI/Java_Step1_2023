package Chapter03.If.While;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		String menu = "";
		while(true) {
			System.out.print("1.입력하기\n2.출력하기\n3.삭제하기\n4.끝내기\n 작업할 번호를 선태해 주세요 >");
			num =scan.nextInt();
			System.out.println();
			switch(num) {
			case 1: {
				System.out.println("1.입력하기를 선택하였습니다");
				break;
			}
			case 2:{
				System.out.println("2.출력하기를 선택하였습니다");
				break;
			}
			case 3:{
				System.out.println("3.삭제하기를 선택하였습니다");
				break;
			}
			case 4:{
				System.out.println("4.끝내기를 선택하였습니다");
				break;
			}
			default :{
				System.out.println("잘못 입력하였습니다.");
				break;
			}
			
			}//switch
			if(num ==4) {
				break;
			}
		}//while

	}

}
