package Chapter04;

public class Example02 {
		public static void main(String[] args) {
		//ȸ�������� 0������ ȸ����ȣ�� �ο��ȴ� ���� �ο��� ������ ��ȣ�� ���� ū ȸ����ȣ�� ����Ͻÿ�
			int max = 0 ;
			int array[] = {1,6,9,2,35,178,234,4,5,11};
			
			//�ִ밪 �˰���
			for(int i = 0; i<array.length;i++) {
				if(max < array[i]) {
					max = array[i];
				}//if
				
			}//for
			System.out.println("ȸ����ȣ �� ��ȣ�� ����ū ȸ����ȣ: "+max);
		}//main
}//class
