package Chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember t=new TeamMember();
		//�޼ҵ带 ���ؼ� ������ �ʱ�ȭ
		t.setTeamName("IT������");
		System.out.println("���� : "+t.getTeamName());
		System.out.println("------[���� ���]-----");
		team.init();
		team.Disp();
		
		System.out.println();
		t.setmName("�躴ȿ");
	    System.out.println("�����̸� : " + t.getmName());
	    t.setMPhone("0102223333");
	    System.out.println("�����ȣ : " + t.getMPhone());
	    t.setsName("��ä��");
	    System.out.println("�������̸� : " + t.getsName());
	    
	    
		
		
		
		
		

	}

}
