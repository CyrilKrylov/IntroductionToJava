package by.epam.module03.string_like_object;

/*Подсчитать, сколько раз среди символов заданной строки встречается буква “а”*/

public class Task5O {

    public static void main(String[] args) {
        System.out.println(countA("abbbbaabbbaabbbaabbba"));
    }

    public static int countA(String inputString) {
        char a;
        String temporaryString;
        int indexOfA;
        int numberOfA;

        a = 'a';
        temporaryString = inputString;
        indexOfA = temporaryString.indexOf(a);
        numberOfA = 0;

        while (indexOfA>=0) {
            numberOfA++;
            temporaryString = temporaryString.substring(indexOfA + 1);
            indexOfA = temporaryString.indexOf(a);
        }
        return numberOfA;
    }

}
