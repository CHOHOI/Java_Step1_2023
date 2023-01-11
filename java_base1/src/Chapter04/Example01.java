package Chapter04;

public class Example01 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
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
					System.out.println(i + "번째 배열의 점수를 줄 단위의 총합:" + sum);
					System.out.println(i + "번째 배열의 점수를 줄 단위의 평균:" + Math.round(avg));
					System.out.println();
				} // for
				System.out.println("전체의 총합" + total);
				*/
				
				//방법1
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
					}//안for
					System.out.println("각 행의 합:"+ sum[i]);
					avg=sum[i]/(double)count;
					System.err.println("각 행의 평균"+ avg);
				}//밖for
				*/
				/*
				//방법2
				for(int i =0 ; i <array.length;i++) {
					for(int j=0; j < array[i].length;j++) {
						total +=array[i][j];
						count++;
						
					}//안for
					avg=total/(double)(array[i].length);
					System.out.println("각 행의 합:"+ total);
					System.err.println("각 행의 평균"+ avg);
					System.out.println("=========================");
					//쓰레기값 초기화
					alltotal+=total; //전체총합
					total =0;
					avg=0;
					System.out.println("-------------------------------");
				}//밖for
				//전체평균
				double allavg =alltotal/(double)count;
				System.out.println("전체총합:"+ alltotal );
				System.out.println("전체평균:"+ allavg );
				*/
				//방법3
				for(int[] num:array) {
					for(int score : num) {
						total+=score;
					}//안 for
					count++;
					System.out.println(count + "반째 학생의 합계" + total);
					total=0;//초기화
				}//밖 for
				

	}

}
