package Chapter03.If;

class clsA {
	void fun() {
		System.out.println("20223�� 1�� ù�� ������ �Դϴ�.");
	}// fun()
}// clsA

class clsB extends clsA {
}// clsB

public class InsTest {

	public static void main(String[] args) {
		// clsB�� �ν��ϼ� ����
		clsB objB = new clsB();
		if (objB instanceof clsA) {
			System.out.println("yes");
			objB.fun();
		} // if

		if (objB instanceof clsB) {
			System.out.println("yes");
		}

	}//Main
	

}//InsTest Class
