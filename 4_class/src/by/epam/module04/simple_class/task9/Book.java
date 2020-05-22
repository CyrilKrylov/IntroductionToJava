package by.epam.module04.simple_class.task9;

/* —оздать класс Book, спецификаци€ которого приведена ниже. ќпределить конструкторы, set- и get- методы и
		  метод toString(). —оздать второй класс, агрегирующий массив типа Book, с подход€щими конструкторами и
		  методами. «адать критерии выбора данных и вывести эти данные на консоль.
		  Book: id, название, автор(ы), издательство, год издани€, количество страниц, цена, тип переплета.
		  Ќайти и вывести:
		  a) список книг заданного автора;
		  b) список книг, выпущенных заданным издательством;
		  c) список книг, выпущенных после заданного года.*/

import java.util.Arrays;
import java.util.Objects;

public class Book {

	private int id;
	private String name;
	private String[] authors;
	private String publishingHouse;
	private int publicationYear;
	private int numberOfPages;
	private double price;
	private Binding binding;

	public Book() {
		defaultInit();
	}

	public Book(int id, String name, String[] authors, String publishingHouse, int publicationYear, int numberOfPages, double price, Binding binding) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.publicationYear = publicationYear;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.binding = binding;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
		sb.append("{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", authors=").append(authors == null ? "null" : Arrays.asList(authors).toString());
		sb.append(", publishingHouse='").append(publishingHouse).append('\'');
		sb.append(", publicationYear=").append(publicationYear);
		sb.append(", numberOfPages=").append(numberOfPages);
		sb.append(", price=").append(price);
		sb.append(", binding=").append(binding);
		sb.append('}');
		return sb.toString();
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return id == book.id &&
				 publicationYear == book.publicationYear &&
				 numberOfPages == book.numberOfPages &&
				 Double.compare(book.price, price) == 0 &&
				 name.equals(book.name) &&
				 Arrays.equals(authors, book.authors) &&
				 publishingHouse.equals(book.publishingHouse) &&
				 binding == book.binding;
	}

	@Override
	public int hashCode() {
		int result = Objects.hash(id, name, publishingHouse, publicationYear, numberOfPages, price, binding);
		result = 31 * result + Arrays.hashCode(authors);
		return result;
	}

	private void defaultInit() {
		this.id = 1;
		this.name = " убок ’охолка";
		this.authors =new String[]{"я и снова €"};
		this.publishingHouse = "Ќа коленке";
		this.publicationYear = 1970;
		this.numberOfPages = 256;
		this.price = 3.33;
		this.binding = Binding.TYPE1;
	}
}
