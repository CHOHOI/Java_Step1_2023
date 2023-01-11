package Chapter04;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// 학생수를 입력받아, 점수를 입력하고 점수리스트를 출력하고 총점과 평균을 분석하는 프로젝트
		boolean run = true;
		
		int student;
		int num, count=0 ;

		int score[]= null;
		Scanner scan = new Scanner(System.in);
		int  sum = 0 , best =0;
		double avg = 0;
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			num = scan.nextInt();
			
			if (num == 1) {
				System.out.print("학생수:");
				student= scan.nextInt();
				score = new int[student];
				
			}//if
			else if(num == 2){
				for(int j=0 ;j < score.length; j++ ) {
					System.out.print("score ["+ (j+1) + "] :");
					score[j] = scan.nextInt();
					sum += score[j];
					count ++;
					if(best < score[j]) {
						best = score[j];
					}
				}//for
				
				
			}//else if
			else if (num ==3) {
				System.out.println("점수리스트:");
				for(int a = 0; a < score.length; a++) {
					System.out.println("score [" +(a+1) +"] : " + score[a]);
				}
			}//else if
			else if(num ==4){
				System.out.println("분석");
				avg = sum/count;
				
				System.out.println("최고 점수: "+best);
				System.out.println("총점 : " +sum);
				System.out.println("평균 : " + avg);
			}else if(num ==5) {
				run = false;
				
			}else {
				System.out.println("번호를 잘못입력하였습니다.");
				run= false;
			}
				
		
		}//while
		System.out.println("프로그램 종료");
	}//main

}//class
