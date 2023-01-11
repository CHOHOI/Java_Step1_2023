package Chapter03.If;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {

		int num1, num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2:"));

		// num1이 크면 num1이 큽니다
		// num2가 크면 num2가 큽니다
		// 그 밖에는 같습니다.
		if (num1 > num2) {
			System.out.println("num1이 num2 보다 큽니다.");
		}else if (num2 > num1) {
			System.out.println("num2가 num1 보다 큽니다.");
		}else
			System.out.println("num1과 num2의 값이 같습니다. ");
	}

}
