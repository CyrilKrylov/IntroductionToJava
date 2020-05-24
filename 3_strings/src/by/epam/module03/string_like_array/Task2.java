package by.epam.module03.string_like_array;

/*Замените в строке все вхождения 'word' на 'letter'.*/

public class Task2 {

    private static final char[] WORD = {'w', 'o', 'r', 'd'};
    private static final char[] LETTER = {'l', 'e', 't', 't', 'e', 'r'};

    public static void main(String[] args) {
        System.out.println(replaceAllWord("cut wordest word word worword"));
    }


    public static String replaceAllWord(String inputWord) {
        String outText;

        outText = inputWord;
        jump:
        for (int i = 0; ; i++) {
            if (i >= outText.length()) {
                break;
            }
            if (outText.charAt(i) == 'w') {
                for (int j = i + 1, k = 1; j < i + 4; j++, k++) {
                    if (outText.charAt(j) - WORD[k] != 0) {
                        continue jump;
                    }

                }

                outText = replaceToWord(outText, i);
                i += LETTER.length - 1;
            }
        }
        return outText;
    }

    private static String replaceToWord(String inputWord, int indexFrom) {
        String outText;
        int lengthDifference;
        int lengthNewWord;

        lengthDifference = LETTER.length - WORD.length;
        lengthNewWord = inputWord.length() + lengthDifference;
        char[] outChars = new char[lengthNewWord];

        for (int i = 0; i < indexFrom; i++) {
            outChars[i] = inputWord.charAt(i);
        }
        for (int i = indexFrom, j = 0; j < LETTER.length; i++, j++) {
            outChars[i] = LETTER[j];
        }
        for (int i = indexFrom + LETTER.length, j = indexFrom + WORD.length;
             i < inputWord.length() + lengthDifference;
             i++, j++) {

            outChars[i] = inputWord.charAt(j);
        }

        outText = new String(outChars);

        return outText;
    }

}
