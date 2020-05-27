package by.epam.module04.agregation_komposition.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Sentence {

	private Word[] words;
	private PunctuationMark[] punctuationMarks;
	private char separator;

	public Sentence(Word[] words, char separator) {
		this.words = words;
		this.separator = separator;
	}

	private Sentence(Word[] words, PunctuationMark[] punctuationMarks, char separator) {
		this.words = words;
		this.punctuationMarks = punctuationMarks;
		this.separator = separator;
	}

	public static Sentence getSentenceWithPunctuationMarks(Word[] words,
														   PunctuationMark[] punctuationMarks,
														   char separator){
		sortPunctuationMarks(punctuationMarks);
		if (!(punctuationMarks[punctuationMarks.length - 1].getIndexAfterWordInSentence() > words.length - 1)) {
			return new Sentence(words, punctuationMarks, separator);
		}
		return null;
	}

	public Word[] getWords() {
		return words;
	}

	public void setWords(Word[] words) {
		this.words = words;
	}

	public PunctuationMark[] getPunctuationMarks() {
		return punctuationMarks;
	}

	public char getSeparator() {
		return separator;
	}

	private static void sortPunctuationMarks(PunctuationMark[] punctuationMarks) {
		Arrays.sort(punctuationMarks, Comparator.comparing(PunctuationMark::getIndexAfterWordInSentence));
	}


	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
		sb.append("{");
		sb.append("words=").append(words == null ? "null" : Arrays.asList(words).toString());
		sb.append(", punctuationMarks=").append(punctuationMarks == null ? "null" : Arrays.asList(punctuationMarks).toString());
		sb.append(", separator=").append(separator);
		sb.append('}');
		return sb.toString();
	}
}
