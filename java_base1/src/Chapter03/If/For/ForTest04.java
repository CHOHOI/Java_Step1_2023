package Chapter03.If.For;

public class ForTest04 {

	public static void main(String[] args) {
		// 0~ 100 ������ ���� Ȧ���� ���ϱ�

		int num;
		int total =0;
		for(num=0;num <=100; num++) {
			if(num % 2 == 0) 
				continue;// ����
			total += num;
			
		}
		System.out.println("0~ 100 ������ ���� Ȧ���� ��:"+total);
		System.out.println("==================================");
		System.out.println();
		System.out.println("1~20������ ���� Ȧ�� ���� ����ϼ���");
		int num1;
		
		for(num1=0; num1 <=20; num1++) {
			if(num1 %2 != 0) 
			
			System.out.println(num1 + "");
		}
		
	}

}
