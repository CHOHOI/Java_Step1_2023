package Chapter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExampleLotto {

	public static void main(String[] args) {
		int number;
		int cnt =0;
		int lotto[] = new int[6];
		int num = 0;
		System.out.println("====�̹��� �ζ� �����ȣ====");
		number=Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));
		while(number > cnt ) {
			System.out.print("["+(cnt+1)+"] :");
			/*
			outer :for(int i=0; i < lotto.length;) {
				lotto[i] = new Random().nextInt(45)+1;
				//�ߺ����� ���ϴ� �ݺ���
				for(int j=0; j <i; j++) {
					if(lotto[i] == lotto[j]) {
						continue outer;
					}//if
					
				}//in for
				System.out.print(lotto[i] + " ");
				i++;
			}//out for
			cnt++;
			System.out.println();
			*/
			
			
			for (int i=0 ; i < lotto.length; i++) {
				lotto[i]= (int)(Math.random()*(45)+1);
				System.out.print(lotto[i]+" ");
			if (num == lotto [i]) {
				num = lotto[i];
				i--;
				break;
			}
				
							
			}
			System.out.println();
			cnt++;
			
		}

	}

}
