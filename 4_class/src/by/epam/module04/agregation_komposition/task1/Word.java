package by.epam.module04.agregation_komposition.task1;

public class Word {

    private String wordsString;

    private Word(String word) {
        this.wordsString = word;
    }

    public static Word getWordFromLetters(char... letters) {
        if (letters.length != 0) {
            String word = new String(letters);
            return new Word(word);
        }
        return null;
    }

    public String getWordsString() {
        return wordsString;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("word='").append(wordsString).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
