package Chapter03.If.While;

import java.util.Scanner;

public class WhileTest05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, cnt=0 , sum=0;
		double avg;
		//0�� �Է��ϸ� ����

		 
		while(true) {
			System.out.println("������ �Է��ϼ���.:");
			num = scan.nextInt();
		
		if(num ==0) {
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			
			break;
			
		}//if
			cnt ++;
			sum+=num;
		}//while
 System.out.println("�Էµ� �ڷ��� ���� :"+cnt);
 System.out.println("�Էµ� �ڷ��� �հ� :"+sum);
 System.out.println("�Էµ� �ڷ��� ��� :"+ (sum/(double)cnt));
 
		
	}
}
