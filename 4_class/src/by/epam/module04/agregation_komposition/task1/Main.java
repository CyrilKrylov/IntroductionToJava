package by.epam.module04.agregation_komposition.task1;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста*/

public class Main {

    public static void main(String[] args) {

        Text[] texts;
        Text text;
        Sentence[] sentences;
        Sentence sentence;
        Sentence sentence1;

        Word[] words;
        Word[] words1;
        Word[] headerWords;
        Word word;
        Word word1;
        Word word2;
        Word word3;
        Word wordHeader;
        Word wordHeader1;
        TextService textService;

        word = Word.getWordFromLetters('С', 'о', 'з', 'д', 'а', 'т', 'ь');
        word1 = Word.getWordFromLetters('о', 'б', 'ъ', 'е', 'к', 'т');
        word2 = Word.getWordFromLetters('к', 'л', 'а', 'с', 'с', 'а');
        word3 = Word.getWordFromLetters('Т', 'е', 'к', 'с', 'т');
        wordHeader = Word.getWordFromLetters('Э', 'т', 'о');
        wordHeader1 = Word.getWordFromLetters('з', 'а', 'г', 'о', 'л', 'о', 'в', 'о', 'к');
        words = new Word[]{word, word1, word2, word3};
        words1 = new Word[]{word, word1, word2, word3};

        sentence = Sentence.getSentenceWithPunctuationMarks(
                words,
                new PunctuationMark[]{new PunctuationMark(',', 1)},
                '.');
        sentence1 = new Sentence(words1, '.');

        headerWords = new Word[]{wordHeader, wordHeader1};

        sentences = new Sentence[]{sentence, sentence1};
        text = new Text(headerWords, sentences);
        texts = new Text[]{text};
        textService = new TextService(texts);

        System.out.println(textService.getAllTexts());

        textService.supplementText(
                0,0,1,Word.getWordFromLetters('Х','о','р','о','ш','и','й'));

        System.out.println(textService.getAllTexts());

    }

}
