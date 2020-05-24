package by.epam.module03.string_like_object;

/*В строке вставить после каждого символа 'a' символ 'b'*/

public class Task2O {


    public static void main(String[] args) {
        System.out.println(putAAfterB("asdfglak;lgka"));
    }

    public static String putAAfterB(String inputString) {
        StringBuilder builder;
        int indexOfA;


        builder = new StringBuilder(inputString);
        indexOfA = builder.indexOf("a");

        while (indexOfA >= 0) {
            builder.insert(++indexOfA, 'b');
            indexOfA = builder.indexOf("a", indexOfA);

        }
        return builder.toString();
    }

}
