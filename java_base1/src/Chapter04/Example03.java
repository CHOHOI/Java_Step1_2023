package Chapter04;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// �л����� �Է¹޾�, ������ �Է��ϰ� ��������Ʈ�� ����ϰ� ������ ����� �м��ϴ� ������Ʈ
		boolean run = true;
		
		int student;
		int num, count=0 ;

		int score[]= null;
		Scanner scan = new Scanner(System.in);
		int  sum = 0 , best =0;
		double avg = 0;
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			num = scan.nextInt();
			
			if (num == 1) {
				System.out.print("�л���:");
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
				System.out.println("��������Ʈ:");
				for(int a = 0; a < score.length; a++) {
					System.out.println("score [" +(a+1) +"] : " + score[a]);
				}
			}//else if
			else if(num ==4){
				System.out.println("�м�");
				avg = sum/count;
				
				System.out.println("�ְ� ����: "+best);
				System.out.println("���� : " +sum);
				System.out.println("��� : " + avg);
			}else if(num ==5) {
				run = false;
				
			}else {
				System.out.println("��ȣ�� �߸��Է��Ͽ����ϴ�.");
				run= false;
			}
				
		
		}//while
		System.out.println("���α׷� ����");
	}//main

}//class
