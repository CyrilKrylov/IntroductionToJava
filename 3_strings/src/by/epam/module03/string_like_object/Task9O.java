package by.epam.module03.string_like_object;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы*/

public class Task9O {

  public static void main(String[] args) {
    countLowAndUpCases("sdffA ASasDD sdflA");
  }

  private static void countLowAndUpCases(String inputString) {
    int countHigh = 0;
    int countLow = 0;

    for (int i = 0; i < inputString.length(); i++) {
      int charcode = inputString.codePointAt(i);
      if (charcode >= (int) 'A' && charcode <= (int) 'Z') {
        countHigh++;
      } else if (charcode >= (int) 'a' && charcode <= (int) 'z') {
        countLow++;
      }
    }
    System.out.println("Количество строчных: " + countLow);
    System.out.println("Количество прописных: " + countHigh);
  }

}
