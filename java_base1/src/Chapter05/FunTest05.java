package Chapter05;

import java.nio.channels.Channel;

public class FunTest05 {
	
	public String channel; //�������
	public int channelInt; //�������
	public int volume; //�������
	//��������
	public FunTest05() {
		
	}
	/*
	public FunTest05(int volume) {
		
	}
	*/
	public void channelUp(int volume) {
		System.out.println("�Ҹ���" + volume + "��ŭ �ø��ϴ�");
	}
	public void channelDown(int volume) {
		System.out.println("�Ҹ���" + volume + "��ŭ �����ϴ�");
	}
	//�����ε�(������ ����)
	public void channelChange(String  channel) {
		System.out.println("ä����" + channel + "�� �ٲߴϴ�.");
	}
	//�����ε�(������ ����)
	public void channelChange(int channelInt) {
		System.out.println("ä����" + channelInt + "�� �ٲߴϴ�.");
	}
	//=============================================
	public static void main(String[] args) {
		
		FunTest05 obj = new FunTest05();
		obj.channelUp(3);
		obj.channelDown(5);
		
		
		obj.channelChange("TvN");
		obj.channelChange(5);
	}//main

}//class
