package Chapter04;

public class ArgsTest {

	public static void main(String[] args) {
		// 배열 선언
				int a[] =new int [5];//Fixed-length
				
				//배열선언2
				int b[]; //선언
				b=new int[5];
				
				int aVal;
				int bVal;
				int Tot;
				
				//배열 선언3
				/*
				String[] str;
				String str[];도 가능
				str =new String[2];
				*/
				args =new String[2];
				args[0] = "1"; //[0]:첨자 = "1":요소
				args[1]= "2";
				
				String[] str;
				str =new String[10];
				
				//length : 배열의 점자 (메모리) 수
				if(args.length ==2) {
					aVal=Integer.parseInt(args[0]) ;
					bVal=Integer.parseInt(args[1]) ;
				}else {
					aVal =0;
					bVal =0;
				}//if
				Tot = aVal + bVal;
				System.out.println(Tot);

	}

}
