package Chapter06;

public class StdInfo {
	public String studnetName;
	public int grade;
	public int money;
	
	//디폴트 free compile
	
	//생성자 오버로딩
	public StdInfo(String studnetName , int money) {
		this.studnetName=studnetName;
		this.money = money;
	}
	//버스
	public void takeBus (Bus bus) {
		bus.take(1000);
		this.money -= 1000; //학생 지출
	}
	//지하철
	public void takeSubway (Subway subway) {
		subway.take(1500); 
		this.money -= 1500; //학생 지출
	}
	
	//남은 잔액
	public void ShowInfo() {
		System.out.println(studnetName + "님의 남은 잔액은 : " + money + "입니다.");
	}
}
