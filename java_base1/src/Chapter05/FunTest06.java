package Chapter05;

public class FunTest06 {
	
		public String channel;
		public int channelInt;
		public int volume;
	
	//������ ����
		
	//void�ܿ� ��� Ÿ���� �޼ҵ�� �ݵ�� �� return ���� ���´�.
		public int channelUp(int volume) {
			this.volume = volume;
			System.out.println("�Ҹ��� ���̰ڽ��ϴ�.");
			return volume+2;
		}
		public void channelDown(int volume) {
			this.volume = volume;
			System.out.println("�Ҹ��� " +  volume+ "��ŭ �����ϴ�.");
			//return volume+2; //void �� ���� return ���� ������ �� ����.
		}
	
	
	//===================================================================
	public static void main(String[] args) {
		FunTest06 tv = new FunTest06();
		
		//���1
		//System.out.println("�Ҹ��� " +  tv.channelUp(9)+ "��ŭ �ø��ϴ�.");
		//���2
		int volume=tv.channelUp(9); // 11
		System.out.println("�Ҹ��� " +  volume+ "��ŭ �ø��ϴ�.");
		tv.channelDown(5);
	}

}
