package Chapter04;

public class Example01 {

	public static void main(String[] args) {
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ���Ͻÿ�
				/*
				int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
				double avg = 0;
				int total = 0;


				for (int i = 0; i < array.length; i++) {
					int sum = 0 , count =0;
					for (int j = 0; j < array[i].length; j++) {
						sum += array[i][j];
						count++;
						avg = sum / (double) count;

					}
					total += sum;
					System.out.println(i + "��° �迭�� ������ �� ������ ����:" + sum);
					System.out.println(i + "��° �迭�� ������ �� ������ ���:" + Math.round(avg));
					System.out.println();
				} // for
				System.out.println("��ü�� ����" + total);
				*/
				
				//���1
				int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
				double avg=0;
				int total=0;
				int count =0;
				int alltotal =0;
				
				/*
				 int sum[] = new int[3];
				for(int i =0 ; i <array.length;i++) {
					for(int j=0; j < array[i].length;j++) {
						sum[i]+=array[i][j];//(0,0),(0,1)| (1,0),(1,1),(1,2)|(2,0),(2,1),(2,2),(2,3),(2,4)
						count++;
					}//��for
					System.out.println("�� ���� ��:"+ sum[i]);
					avg=sum[i]/(double)count;
					System.err.println("�� ���� ���"+ avg);
				}//��for
				*/
				/*
				//���2
				for(int i =0 ; i <array.length;i++) {
					for(int j=0; j < array[i].length;j++) {
						total +=array[i][j];
						count++;
						
					}//��for
					avg=total/(double)(array[i].length);
					System.out.println("�� ���� ��:"+ total);
					System.err.println("�� ���� ���"+ avg);
					System.out.println("=========================");
					//�����Ⱚ �ʱ�ȭ
					alltotal+=total; //��ü����
					total =0;
					avg=0;
					System.out.println("-------------------------------");
				}//��for
				//��ü���
				double allavg =alltotal/(double)count;
				System.out.println("��ü����:"+ alltotal );
				System.out.println("��ü���:"+ allavg );
				*/
				//���3
				for(int[] num:array) {
					for(int score : num) {
						total+=score;
					}//�� for
					count++;
					System.out.println(count + "��° �л��� �հ�" + total);
					total=0;//�ʱ�ȭ
				}//�� for
				

	}

}
