package Chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		FunTest_Overloading obj = new FunTest_Overloading()	;
		obj.getResult(3);
		obj.getResult('a');
		obj.getResult("���� �ָ�~~~~~");
		obj.getResult(6 ," 2023");

	}

}
