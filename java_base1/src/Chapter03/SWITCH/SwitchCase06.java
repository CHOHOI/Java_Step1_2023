package Chapter03.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// ���� 9 ~ ���� 6
		int time = (int)(Math.random()*10)+9;
		System.out.println("[����ð� :" +time + "��]");
		System.out.print("�� ��:");
		switch (time) {
		case 9:
			System.out.println("�������");
			break;
		case 10:
			System.out.println("�������");
			break;
		case 11:
			System.out.println("�������");
			break;
		case 12:
			System.out.println("�������");
			break;
		case 13:
			System.out.println("���ɽð�");
			break;
		case 14:
			System.out.println("�������");
			break;
		case 15:
			System.out.println("�������");
			break;
		case 16:
			System.out.println("�������");
			break;
		case 17:
			System.out.println("�������");
			break;		
		case 18:
			System.out.println("�������");
			break;
		default:
			System.out.println("���ڱ�");
		}
	}

}
