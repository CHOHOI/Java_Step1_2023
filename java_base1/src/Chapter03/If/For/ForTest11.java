package Chapter03.If.For;

public class ForTest11 {

	public static void main(String[] args) {
	 int i, j;
	 for(i=1; i<=5; i++) {
		 for(j=1;j<=i;j++) {
			 System.out.print(j+" ");
		 }//안쪽 for문
	 }//밖의 for문

	}

}
