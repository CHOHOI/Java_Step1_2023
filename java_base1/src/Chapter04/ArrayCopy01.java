package Chapter04;

public class ArrayCopy01 {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int array2[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		} // for
		System.out.println();
		System.out.println("===============================");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		} // for
		System.out.println();
		System.out.println("===============================");

		// �迭���� : (array1, ÷��(���簡 ���۵� ��ġ�� ÷��),array2, ÷��(�ٿ��ֱ� �� ����÷��), �ٿ��ֱ��� ���� ����)
		System.arraycopy(array, 0, array2, 1, 4);
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		} // for

	}// main

}// class
