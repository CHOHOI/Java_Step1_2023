package Chapter04;

public class BookArray02 {
	public static void main(String[] args) {
		
		//Book(); <- 5�� ȣ��
		Book library[] =new Book[5];
		
		library[0] = new Book("���̾�", "�츣�� �켼");
		library[1] = new Book("�����Ӹ���", "����޸�");
		library[2] = new Book("�鼳����", "�׸�����");
		library[3] = new Book("ī������ �ſ�", "�������� ��������");
		library[4] = new Book("�����", "������ �丮");
		/*
		library[0].showBookinfo();
		library[1].showBookinfo();
		library[2].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
		*/
		
		for(int i = 0 ; i<library.length; i++) {
		library[i].showBookinfo();
		}//for
		
	}//main
}//class
