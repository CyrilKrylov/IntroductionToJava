package by.epam.module03.string_like_object;

/*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.*/

public class Task8O {

  public static void main(String[] args) {
    System.out.println(findLongestWord("as asd asd asdf asd"));
  }

  public static String findLongestWord(String inputString) {

    String[] stringArray = inputString.split(" ");

    int maxLength;
    int indexOfMaxLength;

    indexOfMaxLength = 0;
    maxLength = stringArray[indexOfMaxLength].length();

    for (int i = 1; i < stringArray.length; i++) {
      if (indexOfMaxLength == -1) {
        if (maxLength < stringArray[i].length()) {
          maxLength = stringArray[i].length();
          indexOfMaxLength = i;
        }
      } else if (maxLength < stringArray[i].length()) {
        maxLength = stringArray[i].length();
        indexOfMaxLength = i;
      } else if (maxLength == stringArray[i].length()) {
        indexOfMaxLength = -1;
      }
    }

    if (indexOfMaxLength == -1) {
      return null;
    }
    return stringArray[indexOfMaxLength];
  }



}
