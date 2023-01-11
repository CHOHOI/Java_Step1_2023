package Chapter03.If;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		// String -> int : Integer.parseInt(문자열에 들어간 정수를 Int로 바꾸는 명령어)
		
		int dat;
		
		dat =Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));  //숫자를 직접 입력할 때 사용하는 명령어
		
		//10배수를 판단하세요
		//조건 : dat에 있는 값을 10으로 나눈 나머지가 0이냐?
		if (dat%10 == 0)
			System.out.println(dat +"(은)는10배수입니다");
		else
			System.out.println(dat +"(은)는10배수가 아닙니다");	
	}

}
