package chapter01;

public class BinaryTest2 {
public static void main(String[] args) {
	int Num = 10;
	int bNum = 0B1000; //B=Binary 즉 2진수(0B)
	int oNum=010; // 8진수(OCT) ->8진수 표현시 앞에 0으로 표현
	int bNum2=0B10000;
	int hNum=0x30; // 16진수(Hex) ->16진수 표현시 앞에 0x
	//카멜기법 첫글자 무조건 소문자시작 중간 단어의 첫자 대문자 
	//파스칼기법 첫글자가 무조건 대문자 시작
	System.out.println(Num);
	System.out.println(bNum);
	System.out.println(oNum);
	System.out.println(bNum2);
	System.out.println(hNum);
}
}

