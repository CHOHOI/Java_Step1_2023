package Chapter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		int JavaScore[][] = new int[2][3];

		for (int i=0; i <JavaScore.length;i++) {
			for (int j = 0; i < JavaScore[i].length; j++) {
				//입력
				int jumsu =Integer.parseInt(JOptionPane.showInputDialog("점수"));
				//입력받은 점수 대입
				JavaScore[i][j] = jumsu;
				System.out.println("JavaScore["+i+"]["+j+"]"+JavaScore[i][j]);
			} // 안쪽 for
			System.out.println();
		} // 밖의 for

	}

}
