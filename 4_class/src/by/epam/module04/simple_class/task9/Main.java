package by.epam.module04.simple_class.task9;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book();
		Book book2 = new Book();
		BookService bookService = new BookService(new Book[]{book, book1, book2});

		book.setAuthors(new String[]{"����� �.�", "������ �.�"});

		System.out.println(Arrays.toString(bookService.getBooksByAuthor("����� �.�")));

		book1.setPublicationYear(2020);
		book1.setName("�����");

		System.out.println(Arrays.toString(bookService.getBooksAfterPublicationYear(2000)));

		book2.setPublishingHouse("Dorohedoro");

		System.out.println(Arrays.toString(bookService.getBooksByPublishingHouse("�� �������")));
	}

}
