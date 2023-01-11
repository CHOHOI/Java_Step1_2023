package Chapter03.If.While;

import java.util.Scanner;

public class WhileTest05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, cnt=0 , sum=0;
		double avg;
		//0을 입력하면 종료

		 
		while(true) {
			System.out.println("점수를 입력하세요.:");
			num = scan.nextInt();
		
		if(num ==0) {
			System.out.println("프로그램이 종료되었습니다.");
			
			break;
			
		}//if
			cnt ++;
			sum+=num;
		}//while
 System.out.println("입력된 자료의 갯수 :"+cnt);
 System.out.println("입력된 자료의 합계 :"+sum);
 System.out.println("입력된 자료의 평균 :"+ (sum/(double)cnt));
 
		
	}
}
