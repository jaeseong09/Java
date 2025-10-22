package exam1020;

public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0]=new Book("자바","김자바","1");
		books[1]=new Book("파이썬","이파","2");
		books[2]=new Book("디비","박데이터","3",12000);

		for(int i=0;i<books.length;i++) {
			System.out.println("제목 "+books[i].getTitle());
			System.out.println("작가 "+books[i].getAuthor());
			System.out.println("가격 "+books[i].getPrice());
			System.out.println("아이디 "+books[i].getIsbn());
			System.out.println("---------------------------");

		}
	}

}
