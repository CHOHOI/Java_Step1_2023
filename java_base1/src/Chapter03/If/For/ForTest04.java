package Chapter03.If.For;

public class ForTest04 {

	public static void main(String[] args) {
		// 0~ 100 까지의 수중 홀수만 합하기

		int num;
		int total =0;
		for(num=0;num <=100; num++) {
			if(num % 2 == 0) 
				continue;// 무시
			total += num;
			
		}
		System.out.println("0~ 100 까지의 수중 홀수의 합:"+total);
		System.out.println("==================================");
		System.out.println();
		System.out.println("1~20까지의 수중 홀수 값만 출력하세요");
		int num1;
		
		for(num1=0; num1 <=20; num1++) {
			if(num1 %2 != 0) 
			
			System.out.println(num1 + "");
		}
		
	}

}
