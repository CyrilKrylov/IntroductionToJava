package by.epam.module04.agregation_komposition.task1;

public class PunctuationMark {

    private char punctuationMark;
    private int indexAfterWordInSentence;

    public PunctuationMark(char punctuationMark, int indexAfterWordInSentence) {
        this.punctuationMark = punctuationMark;
        this.indexAfterWordInSentence = indexAfterWordInSentence;
    }

    public char getPunctuationMark() {
        return punctuationMark;
    }

    public int getIndexAfterWordInSentence() {
        return indexAfterWordInSentence;
    }
}
