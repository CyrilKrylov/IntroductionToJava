package by.epam.module04.agregation_komposition.task1;

import java.util.Arrays;

public class Text {

	private Word[] header;
	private Sentence[] sentences;

	public Text(Word[] header, Sentence[] sentences) {
		this.header = header;
		this.sentences = sentences;
	}

	public Word[] getHeader() {
		return header;
	}

	public Text setHeader(Word[] header) {
		this.header = header;
		return this;
	}

	public Sentence[] getSentences() {
		return sentences;
	}

	public Text setSentences(Sentence[] sentences) {
		this.sentences = sentences;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Text text = (Text) o;
		return Arrays.equals(header, text.header) &&
				Arrays.equals(sentences, text.sentences);
	}

	@Override
	public int hashCode() {
		int result = Arrays.hashCode(header);
		result = 31 * result + Arrays.hashCode(sentences);
		return result;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
		sb.append("{");
		sb.append("header=").append(header == null ? "null" : Arrays.asList(header).toString());
		sb.append(", sentences=").append(sentences == null ? "null" : Arrays.asList(sentences).toString());
		sb.append('}');
		return sb.toString();
	}
}
