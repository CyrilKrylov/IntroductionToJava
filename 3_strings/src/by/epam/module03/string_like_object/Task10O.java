package by.epam.module03.string_like_object;

/*Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X*/

public class Task10O {

  public static void main(String[] args) {
    System.out.println(countSentences("sdfasdf sdas asf. asfsdf asfasd .asd adf asdf!fddfsfsd?sdfgsdf."));
    System.out.println(countSentences("sdfasdf sdas asf"));
  }

  public static int countSentences(String inputText) {
    int numberOfSentences = 0;
    if (!(inputText.contains(".") || inputText.contains("!") || inputText.contains("?"))) {
      return numberOfSentences;
    }

    numberOfSentences += inputText.split("\\.").length - 1;
    numberOfSentences += inputText.split("!").length - 1;
    numberOfSentences += inputText.split("\\?").length - 1;
    return ++numberOfSentences;
  }

}
