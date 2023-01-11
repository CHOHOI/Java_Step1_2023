package 과제;

public class Q4 {

	public static void main(String[] args) {
		System.out.println("=====Q1======");
		byte num2 = 10;
		int num3 = num2;
		System.out.println("num2:"+num3);

		short num4 = 4586;
		long num5 = num4;
		System.out.println("num4:"+num5);
		
		
		
		System.out.println("=====Q2======");
		float aVal = 2.3f;
		int bVal= (int)aVal;
		
		System.out.println("aVal:" +bVal);
		
		double cVal=4.7;
		System.out.println("cVal:" +(int)cVal);
		

		System.out.println("====Q3=====");	
		System.out.println("부동소수점");
		System.out.println("=====Q4======");
		int gVal = 10;
		double hVal = 2.5;
		
		System.out.println("gVal+hVal:" +(int)(gVal+hVal));
		System.out.println("gVal-hVal:" +(int)(gVal-hVal));
		System.out.println("gVal*hVal:" +(int)(gVal*hVal));
		System.out.println("gVal/hVal:" +(int)(gVal/hVal));
		
		
		System.out.println("=====Q5======");
		char ch1= '\uAE00'; //유니코드(16진수)
		 
		 System.out.print(ch1);
	}

}
