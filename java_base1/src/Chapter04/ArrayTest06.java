package Chapter04;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		int sum =0;
		
		for(int i=0 ; i <score.length;i++) {
			System.out.println("score["+i+"]"+score[i]);
			sum += score[i];
			
		}//for
		double avg=sum/(double)(score.length);
		System.out.println("Score�� ����" + sum);
		System.out.println("Score�� ���" + avg);
		//�ݿø�
		System.out.println("Score�� ���" + Math.round(avg));

	}

}
