package chapter01;

public class BinaryTest2 {
public static void main(String[] args) {
	int Num = 10;
	int bNum = 0B1000; //B=Binary �� 2����(0B)
	int oNum=010; // 8����(OCT) ->8���� ǥ���� �տ� 0���� ǥ��
	int bNum2=0B10000;
	int hNum=0x30; // 16����(Hex) ->16���� ǥ���� �տ� 0x
	//ī���� ù���� ������ �ҹ��ڽ��� �߰� �ܾ��� ù�� �빮�� 
	//�Ľ�Į��� ù���ڰ� ������ �빮�� ����
	System.out.println(Num);
	System.out.println(bNum);
	System.out.println(oNum);
	System.out.println(bNum2);
	System.out.println(hNum);
}
}

