package Chapter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		int JavaScore[][] = new int[2][3];

		for (int i=0; i <JavaScore.length;i++) {
			for (int j = 0; i < JavaScore[i].length; j++) {
				//�Է�
				int jumsu =Integer.parseInt(JOptionPane.showInputDialog("����"));
				//�Է¹��� ���� ����
				JavaScore[i][j] = jumsu;
				System.out.println("JavaScore["+i+"]["+j+"]"+JavaScore[i][j]);
			} // ���� for
			System.out.println();
		} // ���� for

	}

}
