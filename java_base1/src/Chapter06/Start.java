package Chapter06;

import java.util.Random;

public class Start {
	
	private int random = new Random().nextInt(50)+1;
	private int count=0;
	private String result = "FAIL";
	
	public String check(int mynumber) {
		count ++ ;
		//random ������ ������ up / ũ�� down / ��ġ�ϸ� -> result = "SUCCESS"
		if (mynumber < random) {
			System.out.println("up");
		}else if(mynumber >random ) {
			System.out.println("DOWN");
		}else if (mynumber == random) {
			result = "SUCCESS";
			System.out.println(count + "ȸ ���� ����!!");
		}return result;
		
		}
	   
}
