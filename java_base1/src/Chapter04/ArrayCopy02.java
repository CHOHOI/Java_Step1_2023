package Chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {
		//���� ����
		//Book bookArray1 1�迭 3�� ���� ÷�ڸ� ���� �迭 ����
		Book bookArray1[] =new Book[3];
		
		//Book bookArray2 2�迭 3�� ���� ÷�ڸ� ���� �迭 ����
		Book bookArray2[] =new Book[3];
		
		// �ʱ�ȭ
	
		bookArray1[0] = new Book("���̾�", "�츣�� �켼");
		bookArray1[1] = new Book("�����Ӹ���", "����޸�");
		bookArray1[2] = new Book("�鼳����", "�׸�����");

		System.out.println("-------����(bookArray1)-------");
		for(int i=0; i < bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}//for��
		//����
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		System.out.println("-------���纻(bookArray2)-------");
		for(int i =0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}//for��
		//=========================================
		System.out.println();
		bookArray1[0].setBookname("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		System.out.println("-----��������(bookArray1)------");
		for(int i=0; i < bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}//for��
		System.out.println();
		System.out.println("-----���纻����(bookArray2)------");
		for(int i =0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
		}//for ��
	}//main

}//class
