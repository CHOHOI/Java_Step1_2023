package Chapter04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {

		String strArray[]= {"Java","Oracle","Html5,css,JS,JQ","Spring", "PythonCamp"};

		for(int i=0 ; i<strArray.length;i++) {
		System.out.println(strArray[i]);	
		}//for
		System.out.println("========================");
		//È®Àå for
		for(String lang:strArray) { //String lang = strArray[];
			System.out.println(lang);
		}//for
	}

}
