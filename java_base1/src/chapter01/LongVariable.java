package chapter01;

public class LongVariable {
	public static void main(String[] args) {
//int num1=1234568900; //32��Ʈ=4Byte
		long num2=12345678900L;
		long num3=1000; // long���� 64��Ʈ ������ L�� ������ �������� int�� �ν�
		
		int level; //�����ϰ� �ʱ�ȭ���� ����
		level=10; //���ͳ� ��
		
		System.out.println(num2+num3); //����� : long
		System.out.println(level); 
	}
	
}