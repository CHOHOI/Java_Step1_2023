package Chapter07;

public class OverloadMain {

	public static void main(String[] args) {
		
		Overload obj1=new Overload();
		obj1.Disp();
		System.out.println();
		
		Overload obj2=new Overload(22, 172.6f);
		obj2.Disp();
		System.out.println();
		
		Overload obj3=new Overload(22, 172.6f, "ÀÌ¼ø½Å");
		obj3.Disp();

	}

}
