package Chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void DIsp(String A[]) {
		String res = "";
		for(int i = 0; i<A.length ; i++) {
			res += A[i] + "\n";
		}
		/*
		for(String str : A ) {
			res += str + " ";
		}
		System.out.print(res);
		*/
		System.out.println(res);
		/*JOptionPane.showMessageDialog(null, "�迭�� ���Ұ� \n\n" + res);
	*/
	}
	public static void main(String[] args) {
		String str[] = {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};
		DIsp(str);
	}

}
