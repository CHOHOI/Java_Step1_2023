package Chapter03.Example;

public class Example_for01 {

	public static void main(String[] args) {
		// 1~100까지의 수중 3의 배수의 합
		int i ;
		int sum = 0;
		for (i=1;i<=100;i++) {
			if(i%3 ==0) {
			sum +=i;
			}//if
				
		}//for
			System.out.println("1~100까지의 수중 3의 배수의 합:"+sum);
	}//main

}//class
