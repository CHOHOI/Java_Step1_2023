package Chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		//��������
		System.out.println("===��������===");
		int gamescore = 150;
		//int lastscore = gamescore+1;
		int lastscore1 = ++gamescore;
		
		System.out.println(lastscore1);
		System.out.println("======================");
		int lastscore2 = --gamescore;
		System.out.println(lastscore2);//150
		
		//��������
		System.out.println("===��������==="); 
		
		int lastscore3 = gamescore++; //�а� ���� �� ���ϱ�
		
		System.out.println(lastscore3);//150
		System.out.println(gamescore);//151
		System.out.println("======================");

		int lastscore4 = gamescore--; //�а� ���� �� ���ϱ�
		
		System.out.println(lastscore4);//151
		System.out.println(gamescore);//150
		System.out.println("======================");
	}

}
