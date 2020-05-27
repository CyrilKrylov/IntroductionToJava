package by.epam.module04.agregation_komposition.task1;

import java.util.Arrays;

public class TextService {

    private Text[] texts;

    public TextService(Text[] texts) {
        this.texts = texts;
    }

    public Text[] getTexts() {
        return texts;
    }

    public TextService setTexts(Text[] texts) {
        this.texts = texts;
        return this;
    }

    public String getAllTexts() {
        StringBuilder sb = new StringBuilder();

        for (Text text : this.texts) {
            sb.append(getTextString(text));
        }
        return sb.toString();
    }

    public void supplementText(int indexOfText, int indexOfSentence, int indexToInsert, Word word) {
        int arrayLength;
        Word[] newWords;
        Word[] words;

        words = this.texts[indexOfText].getSentences()[indexOfSentence].getWords();
        arrayLength = words.length;
        newWords = new Word[arrayLength + 1];
        System.arraycopy(words, 0, newWords, 0, indexToInsert);
        newWords[indexToInsert] = word;
        System.arraycopy(words,indexToInsert,newWords,indexToInsert+1,arrayLength-indexToInsert);
        this.texts[indexOfText].getSentences()[indexOfSentence].setWords(newWords);
    }

    private StringBuilder getTextString(Text text) {
        StringBuilder sb = new StringBuilder("\n");

        for (int i = 0; i < text.getHeader().length; i++) {
            sb.append(text.getHeader()[i].getWordsString()).append(" ");
        }
        sb.append("\n\n");

        for (int i = 0; i < text.getSentences().length; i++) {
            StringBuilder sentenceFromWords;
            Sentence currentSentence;

            currentSentence = text.getSentences()[i];
            sentenceFromWords = WordsToSentenceBinder.getSentenceString(currentSentence);
            sb.append(sentenceFromWords).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("\n");
        return sb;
    }

}
