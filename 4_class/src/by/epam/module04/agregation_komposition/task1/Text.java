package by.epam.module04.agregation_komposition.task1;

public class Text {

	private Word[] words;
	private Sentence[] sentences;

	public Text() {
	}

	public Text(Word[] words, Sentence[] sentences) {
		this.words = words;
		this.sentences = sentences;
	}
}
