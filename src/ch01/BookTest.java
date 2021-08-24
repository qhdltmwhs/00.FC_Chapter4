package ch01;

class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	/*
	@Override
	public String toString() {
		return title + ", " + author;
	}
	*/
}

public class BookTest {

	public static void main(String[] args) {

		/*
		 * toString() 메서드가 재정의(override) 되지않음 
		 * package를 포함한 class 풀네임이 반환됨 
		 * ex) ch01.Book@7852e922
		 */
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book);

		/*
		 * toString() 메서드가 재정의(override) 됨 
		 * test 가 반환됨
		 */
		String str = new String("test");
		System.out.println(str.toString());

	}

}
