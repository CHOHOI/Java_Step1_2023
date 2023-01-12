package Chapter06;

public class TakeTrans {
	public static void main(String[] args) {
		//학생 2명 생성
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTom = new StdInfo("Tom", 10000);
		//버스타기
		Bus bus100=new Bus(100);
		Bus bus160=new Bus(160);
		studentJames.takeBus(bus100);
		studentTom.takeBus(bus160);
		//정보확인
		studentJames.ShowInfo();//지출
		bus100.showInfo();//수입증가
		System.out.println("=========================================");
		studentTom.ShowInfo();//지출
		bus160.showInfo();//수입증가
		System.out.println("=========================================");
		//지하철타기
		Subway subway4 = new Subway("4호선");
		Subway subway1 = new Subway("1호선");
		studentTom.takeSubway(subway4);
		studentJames.takeSubway(subway1);
		//정보확인
		studentTom.ShowInfo();//지출
		subway4.showInfo();//수입증가
		System.out.println("=========================================");
		studentJames.ShowInfo();//지출
		subway1.showInfo();//수입증가
	}
}
