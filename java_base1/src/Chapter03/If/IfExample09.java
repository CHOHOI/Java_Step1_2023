package Chapter03.If;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class IfExample09 {

	public static void main(String[] args) {
		//데이터 베이스
		String ID = "soldesk";
		int PW = 221227;
		
		//Scanner scan
		Scanner scan = new Scanner(System.in);
		//ID 받기
		System.out.print("아이디:");
		String inputID=scan.nextLine();
				
		if(ID.equals(inputID)) {
			//비번입력 받고
			System.out.print("비밀번호:");
			String inputPW = scan.nextLine();
			/*
			String PW = scan.nextLine();
			int pass = Integer.parseInt(PW);
			
			if (pass == 221227) {
				System.out.println("로그인에 성공하였습니다");
				
			if(PW == Integer.parseInt(inputPW))
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
			*/
			//비번확인
			if( PW == Integer.parseInt(inputPW)) {
				System.out.println("로그인에 성공하였습니다");
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}else {
			System.out.println("아이디가 틀렸습니다");
		}

	}

}
