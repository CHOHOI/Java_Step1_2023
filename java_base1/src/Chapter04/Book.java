package Chapter04;

public class Book {
	public String bookname; // 멤버변수
	public String author;	//public  공통사용할 때 사용

	// 디폴트 생성
	public Book() {

	}
	
	public Book(String bookname,String author) {
		this.bookname = bookname;
		this.author = author;
	}

	// =================================
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
//===============================================
	// 사용자의 정의
	public void showBookinfo() {
		System.out.println("책이름 :" + bookname + " | 저자 :" + author);
	}

}// class
