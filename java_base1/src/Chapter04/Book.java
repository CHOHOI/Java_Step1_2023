package Chapter04;

public class Book {
	public String bookname; // �������
	public String author;	//public  �������� �� ���

	// ����Ʈ ����
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
	// ������� ����
	public void showBookinfo() {
		System.out.println("å�̸� :" + bookname + " | ���� :" + author);
	}

}// class
