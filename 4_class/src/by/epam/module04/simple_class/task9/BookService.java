package by.epam.module04.simple_class.task9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BookService {

	private Book[] books;

	public BookService(Book[] books) {
		this.books = books;
	}

	public Book[] getBooksByAuthor(String authorName) {
		Book[] booksByAuthor;
		int arrayLength;

		booksByAuthor = new Book[this.books.length];
		arrayLength = 0;

		for (Book book : books) {
			if (authorsContainAuthor(book.getAuthors(), authorName)) {
				booksByAuthor[arrayLength++] = book;
			}
		}

		return Arrays.copyOf(booksByAuthor, arrayLength);

	}

	public Book[] getBooksByPublishingHouse(String publishingHouse) {
		Book[] booksByPublishingHouse;
		int arrayLength;

		booksByPublishingHouse = new Book[this.books.length];
		arrayLength = 0;

		for (Book book : books) {
			if (book.getPublishingHouse().equals(publishingHouse)) {
				booksByPublishingHouse[arrayLength++] = book;
			}
		}

		return Arrays.copyOf(booksByPublishingHouse, arrayLength);

	}

	public Book[] getBooksAfterPublicationYear(int publicationYear) {
		Book[] booksAfterPublicationYear;
		int arrayLength;

		booksAfterPublicationYear = new Book[this.books.length];
		arrayLength = 0;

		for (Book book : books) {
			if (book.getPublicationYear() > publicationYear) {
				booksAfterPublicationYear[arrayLength++] = book;
			}
		}

		return Arrays.copyOf(booksAfterPublicationYear, arrayLength);

	}

	private boolean authorsContainAuthor(String[] authors, String author) {
		for (String s : authors) {
			if (s.equals(author)) {
				return true;
			}
		}
		return false;
	}

}
