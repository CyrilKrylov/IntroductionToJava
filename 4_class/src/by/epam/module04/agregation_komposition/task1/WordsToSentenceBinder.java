package by.epam.module04.agregation_komposition.task1;

public class WordsToSentenceBinder {

    public static StringBuilder getSentenceString(Sentence sentence) {
        if (sentence.getPunctuationMarks() != null) {
            return getSentenceWithPunctuationMarks(sentence);
        }else {
            return getSentenceWithoutPunctuationMarks(sentence);
        }
    }

    private static StringBuilder getSentenceWithPunctuationMarks(Sentence sentence) {
        StringBuilder sb = new StringBuilder();
        int punctuationMarkIndex = 0;

        for (int i = 0; i < sentence.getWords().length; i++) {
            sb.append(sentence.getWords()[i].getWordsString());
            if (sentence.getPunctuationMarks().length > punctuationMarkIndex
                    && sentence.getPunctuationMarks()[punctuationMarkIndex].getIndexAfterWordInSentence() == i) {
                sb.append(sentence.getPunctuationMarks()[punctuationMarkIndex].getPunctuationMark()).append(" ");
                punctuationMarkIndex++;
            } else {
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(sentence.getSeparator());
        return sb;
    }

    private static StringBuilder getSentenceWithoutPunctuationMarks(Sentence sentence) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sentence.getWords().length; i++) {
            sb.append(sentence.getWords()[i].getWordsString()).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(sentence.getSeparator());
        return sb;
    }

}
