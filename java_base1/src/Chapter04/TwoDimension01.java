package Chapter04;

public class TwoDimension01 {
	public static void main(String[] args) {
		int arr[][] = new int [2][3];
		int n=0;
		
		for(int i= 0; i<arr.length;i++) {
			for(int j =0 ; j < arr[i].length;j++) {
				n++;
				System.out.print((arr[i][j]=n)+" ");//리터럴 입력 후 출력
			}//안의for
			System.out.println();
		}//밖의for
		System.out.println("--------------------------");
		System.out.println(arr.length);//행
		System.out.println(arr[0].length);//열
		System.out.println("--------------------------");
		
		int arr1[][] = {{1,2,3},{4,5,6}};
		for(int i = 0 ; i <arr.length; i++) {//각줄의 끝까지 읽음
			for(int j=0; j <arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}// 안 for
			System.out.println();
		}//밖 for

	}

}
