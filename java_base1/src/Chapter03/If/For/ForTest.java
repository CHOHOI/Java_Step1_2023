package Chapter03.If.For;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수를 입력받다 총점과 평균을 구하시오(단 ,평균은 실수로 출력할 것)
		
		Scanner scan =new Scanner(System.in);
		int i, sum=0, cnt=0;
		double avg=0;
		
		System.out.print("몇명의 학생 점수를 입력 받으시겠습니까? ");
		int stu =scan.nextInt();
		
		for(i=1; i<=stu; i++) {
		System.out.println(i +"번째 학생의 점수를 입력하세요");
		int sco = scan.nextInt();
		sum += sco;
			cnt++;//인원수 누적
		}
		avg = (sum/stu);
		System.out.println(stu + "명의 총점" + sum);
		System.out.println(stu + "명의 평균" + avg);
		
	}

}
