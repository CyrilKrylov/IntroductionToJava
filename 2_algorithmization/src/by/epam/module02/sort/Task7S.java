package by.epam.module02.sort;

/*Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm .
Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <=...<= bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.*/

public class Task7S {

    public static void main(String[] args) {

        int[] arrayA = { 12, 13, 16,17};
        int[] arrayB= {3, 4, 7, 14, 15, 19, 20,21};

        showIndexesForInsertions(arrayA, arrayB);
    }

    public static void showIndexesForInsertions(int[] a, int[] b) {

        int aBuffer = 0;
        int bBuffer = 0;

        for (int i = 0; i < a.length + b.length; i++) {
            if (bBuffer >= a.length&&aBuffer == a.length) {
                System.out.println("Оставшиеся элементы вставить в конец последовательности");
                break;
            }
            if (aBuffer == a.length) {
                System.out.println(i);
                bBuffer++;
                continue;
            }
            if (bBuffer == b.length) {
                break;
            }
            if (a[aBuffer] >= b[bBuffer]) {
                System.out.println(i);
                bBuffer ++;
            } else {
                aBuffer ++;
            }
        }
    }

}
