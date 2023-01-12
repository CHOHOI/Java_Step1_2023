package Chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		String check;
		int select;
		Start str = new Start();
		//객체생성
		while(true) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 : ");
		select = scan.nextInt();
		check =str.check(select);
		if(check.equals("SUCCESS")) {
			break;
		}
			
		/*
		select = scan.nextInt();
		str.check(select);
		*/
		}
	}

}
