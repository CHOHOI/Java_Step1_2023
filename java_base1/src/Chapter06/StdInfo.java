package Chapter06;

public class StdInfo {
	public String studnetName;
	public int grade;
	public int money;
	
	//����Ʈ free compile
	
	//������ �����ε�
	public StdInfo(String studnetName , int money) {
		this.studnetName=studnetName;
		this.money = money;
	}
	//����
	public void takeBus (Bus bus) {
		bus.take(1000);
		this.money -= 1000; //�л� ����
	}
	//����ö
	public void takeSubway (Subway subway) {
		subway.take(1500); 
		this.money -= 1500; //�л� ����
	}
	
	//���� �ܾ�
	public void ShowInfo() {
		System.out.println(studnetName + "���� ���� �ܾ��� : " + money + "�Դϴ�.");
	}
}
