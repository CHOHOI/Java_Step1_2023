package Chapter06;

public class TeamMember {
	
	//�������
	public String teamName;//����
	public String mName;//����
	public String mPhone;//������ȭ��ȣ
	public String sName;//������
	public String name; //����
	public String gender;//��������
	
	//�⺻ ������
	public TeamMember() {}
	
	//���� �ε�(�����ڸ� ���Ͽ� �ʱ�ȭ)
	public TeamMember(String name, String gender) {
		this.name=name;
		this.gender=gender;
	}

	//�޼ҵ� ���� �ʱ�ȭ
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getMPhone() {
		return mPhone;
	}

	public void setMPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}