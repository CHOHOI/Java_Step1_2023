package Chapter06;

public class TeamGroup {
	
	//�������(�迭->��������)
	private TeamMember[] member = new TeamMember[6];
	
	//�⺻ ������
	
	//�ʱ�ȭ �޼ҵ�
	public void init() {
		member[0] = new TeamMember("��â��", "��");
		member[1] = new TeamMember("������", "��");
		member[2] = new TeamMember("�����", "��");
		member[3] = new TeamMember("�ڼ���", "��");
		member[4] = new TeamMember("������", "��");
		member[5] = new TeamMember("�ڹ���", "��");
	}
	
	//��� �޼ҵ�
	public void Disp() {
		for(int i=0; i<member.length; i++) {
			//System.out.print("���� : " + (member[i].getGender().equals("M") ? "��" : "��"));
			System.out.print("���� : " + (member[i].getGender()));
			System.out.println(", ���� : " + member[i].getName());
		}
	}

}
