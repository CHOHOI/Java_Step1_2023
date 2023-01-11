package Chapter03.If;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample08 {

	public static void main(String[] args) {

		String ID = "soldesk"; // 인스턴스 변수
		int PW = 221227; // 정수형 변수

		// 고객
		String id = JOptionPane.showInputDialog("아이디");
		int pass = Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));

		if (id == ID) {
			if (PW == pass) {
				System.out.println("로그인에 성공하였습니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		} 
		else 
			System.out.println("아이디가 일치하지 않습니다");
		

	}// 메인
}// 클레스
