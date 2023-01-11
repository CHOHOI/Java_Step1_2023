package Chapter03.If.For;

public class ForTest16 {

	public static void main(String[] args) {
		int i, j, k;
		for(i=2; i<=9; i++) {
			System.out.print("["+i +"단"+"]" + "\t");
		}
			for(j=1; j<=9; j++) {
				System.out.println();
				for(k=2; k<= 9;k++) {
					System.out.print(k+"*"+j + "="+(k*j)+"\t");
				}//안의 for
		
			}//밖의 for
			
		

	}

}
