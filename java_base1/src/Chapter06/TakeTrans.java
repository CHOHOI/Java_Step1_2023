package Chapter06;

public class TakeTrans {
	public static void main(String[] args) {
		//�л� 2�� ����
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTom = new StdInfo("Tom", 10000);
		//����Ÿ��
		Bus bus100=new Bus(100);
		Bus bus160=new Bus(160);
		studentJames.takeBus(bus100);
		studentTom.takeBus(bus160);
		//����Ȯ��
		studentJames.ShowInfo();//����
		bus100.showInfo();//��������
		System.out.println("=========================================");
		studentTom.ShowInfo();//����
		bus160.showInfo();//��������
		System.out.println("=========================================");
		//����öŸ��
		Subway subway4 = new Subway("4ȣ��");
		Subway subway1 = new Subway("1ȣ��");
		studentTom.takeSubway(subway4);
		studentJames.takeSubway(subway1);
		//����Ȯ��
		studentTom.ShowInfo();//����
		subway4.showInfo();//��������
		System.out.println("=========================================");
		studentJames.ShowInfo();//����
		subway1.showInfo();//��������
	}
}
