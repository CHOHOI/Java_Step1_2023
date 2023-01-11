package Chapter04;

import java.util.Scanner;


public class BookArray01 {
	public static void main(String[] args) {
		//BOOK bk = new Book()
		Book bk[] = new Book[5];
		
		//가져올 때는 선언한 클래스에 .get 사용
		//ex) bk.getBook
		
		for(int i=0 ; i<bk.length;i++) {
			System.out.println(bk[i]);
		}//for
		
	}//main
}//class
