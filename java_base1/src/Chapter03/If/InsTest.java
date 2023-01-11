package Chapter03.If;

class clsA {
	void fun() {
		System.out.println("20223년 1월 첫주 월요일 입니다.");
	}// fun()
}// clsA

class clsB extends clsA {
}// clsB

public class InsTest {

	public static void main(String[] args) {
		// clsB의 인스턴수 변수
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
