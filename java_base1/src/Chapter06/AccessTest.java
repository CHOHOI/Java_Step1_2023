package Chapter06;

import java.util.Scanner;

public class AccessTest {
	
	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴트 생성자
	
	//메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	public void Disp() {
		System.out.println("aa값 : " + aa + "\nbb값: "+ bb + "\ncc값: " + cc);
	}
	
	
	
	public static void main(String[] args) {
		
			AccessTest obj = new AccessTest();
			Scanner scan = new Scanner(System.in);
			System.out.print("aa 점수입력: ");
			obj.aa= scan.nextInt();
			//obj.setAa(10);
			System.out.print("bb 점수입력: ");
			obj.bb= scan.nextInt();
			System.out.print("cc 점수입력: ");
			obj.cc= scan.nextInt();
			
			obj.Disp();



}
}
	
