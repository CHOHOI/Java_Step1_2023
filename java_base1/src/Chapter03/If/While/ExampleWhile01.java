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
			System.out.print("1.���� |2.��� |3.�ܰ� |4.����"  );
			System.out.println();
			System.out.println("============================");
			System.out.print("����>");
			*/
			/*
			int i = scan.nextInt();
			if(i == 1) {
				System.out.print("���ݾ� :");
				 a = scan.nextInt();
			}else if (i ==2) {
				System.out.print("��ݾ� :");
				 b = scan.nextInt();
			}else if(i == 3) {
				System.out.println("�ܰ� :"+ (a-b));
			}//if
			
			if(i == 4) {
				System.out.print("�ŷ��� ���� �Ǿ����ϴ�.");
				break;
			}
			*/
			/*
			int menuNum = Integer.parseInt(scan.nextLine());
			switch(menuNum) {
			case 1://0������ �ݾ��� �ԷµǾ��� �� ����ó��
				System.out.print("���ݾ�>");
				balance += Integer.parseInt(scan.nextLine());
				if(balance == 0) {
					System.out.println("�ٽ� �Ա����ּ���");
				}
				break;
			case 2://�ܾ��� �����մϴ�.
				System.out.print("��ݾ�>");
				balance -= Integer.parseInt(scan.nextLine());
				
				if(balance < 0) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				break;
			case 3:
				System.out.print("�ܰ�>");
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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			num = scan.nextInt();
			
			if(num==1) {
				System.out.println("������ �����ϼ̽��ϴ�");
				System.out.println("���� �ݾ� : "+save);
				System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
				money=scan.nextInt();
				save+=money;
				if(money <=0) 
					System.out.println("�ݾ��� �߸� �Է��ϼ̽��ϴ�");
				}else if(num==2) {
					System.out.println("����� �����ϼ̽��ϴ�");
					System.out.println("���� �ݾ� : "+save);
					System.out.print("����� �ݾ��� �Է��ϼ��� : ");
					money=scan.nextInt();
					save -=money;//save=save-money;
					if(save<0) {
						System.out.println("�ܾ��� �����մϴ�");
						save +=money;//�ܾ��� �����ϹǷ� ��ݽõ��ߴ� �ݾ��� �ٽ� �Ա�
					}
				}else if (num==3) {
					System.out.println("�ܾ�Ȯ���� �����ϼ̽��ϴ�");
					System.out.println("���� �ݾ� : "+save);
				}else if(num==4) {
					System.out.println("���Ḧ �����ϼ̽��ϴ�");
					run=false;
				}else {
					System.out.println("�߸��� ���� ��ȣ�� �����ϼ̽��ϴ�");
				}//if

			System.out.println("1.�ʱ�޴� 2.����");
			num2=scan.nextInt();
			
			if(num2==2) {
				run=false;
			}
			} //while
		}

	}
