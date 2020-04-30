package by.epam.module02.onedimensional_array;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать*/

public class Task10 {

    public static void compressArray(int[] a) {
        int numberOfSignificantElements = a.length % 2 == 0 ? a.length / 2 : a.length / 2 + 1;
        for (int i = 1; i < numberOfSignificantElements; i++) {
            a[i] = a[i * 2];
        }
        for (int i = numberOfSignificantElements; i < a.length; i++) {
            a[i] = 0;
        }
    }
}
