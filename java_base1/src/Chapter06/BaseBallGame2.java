package Chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame2 {
private String com;
	
	public BaseBallGame2() {
		
		com = "000";
		
		do {
			com = "";
			for(int i=0; i<3; i++) {
				com += (char)(new Random().nextInt(9) + 49); //�ƽ�Ű�ڵ� '1' ~ '9' ������ �� ����
			}
		}while(com.charAt(0) == com.charAt(1) || com.charAt(1) == com.charAt(2) || com.charAt(2) == com.charAt(0));
		
		//System.out.println("���� : " + com);
	}
	
	public String check() {
		Scanner scan = new Scanner(System.in);
		String result = "LOSE";
		
		System.out.print("���ڸ� ���� �Է��ϼ��� : ");
		String user = scan.next();
		int strike=0, ball=0;
		
		outer : for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(com.charAt(i) == user.charAt(j)) {
					if(i == j) { // ������ ��Ʈ����ũ�� �����ϰ� ���̻� �ش� �ڸ����� ���� �ʴ´�.
						 strike++;
						 continue outer;
					}
					else{ // �ڸ����� �ٸ����� ���� ����
						ball++;
					}
				}
			}
		}
		
		System.out.println(strike + " strike, " + ball + " ball ");
		if(strike == 3) {
			result = "WIN";
		}
		
		return result;
	}

}
