package Chapter03.If.For;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// ����� ������ �Է� ���� ������ ������ �ο����� �Է¹޴� ������ ����� ���Ͻÿ�(�� ,����� �Ǽ��� ����� ��)
		
		Scanner scan =new Scanner(System.in);
		int i, sum=0, cnt=0;
		double avg=0;
		
		System.out.print("����� �л� ������ �Է� �����ðڽ��ϱ�? ");
		int stu =scan.nextInt();
		
		for(i=1; i<=stu; i++) {
		System.out.println(i +"��° �л��� ������ �Է��ϼ���");
		int sco = scan.nextInt();
		sum += sco;
			cnt++;//�ο��� ����
		}
		avg = (sum/stu);
		System.out.println(stu + "���� ����" + sum);
		System.out.println(stu + "���� ���" + avg);
		
	}

}
