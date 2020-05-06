package by.epam.module02.sort;

/*Даны две последовательности a1 <= a2 <=...<= an и b1 <= b2 <=...<= bm. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/

import java.util.Arrays;

public class Task2S {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(joinAscendingSequences(
                new int[]{1,3,5,7,9,10},
                new int[]{2,3,4,5,6,7,8,9,20}
        )));
    }

    public static int[]  joinAscendingSequences(int[] a, int[] b){
        int[] outSequence;
        int newLength;
        int aIndexBuffer;
        int bIndexBuffer;

        newLength = a.length + b.length;
        outSequence = new int[newLength];
        aIndexBuffer = 0;
        bIndexBuffer= 0;

        for (int i = 0; i < outSequence.length; i++) {
            if (aIndexBuffer == a.length) {
                outSequence[i] = b[bIndexBuffer];
                bIndexBuffer++;
                continue;
            } if (bIndexBuffer == b.length){
                outSequence[i] = a[aIndexBuffer];
                aIndexBuffer++;
                continue;
            }
            if (a[aIndexBuffer] > b[bIndexBuffer]) {
                outSequence[i] = b[bIndexBuffer];
                bIndexBuffer++;
            } else {
                outSequence[i] = a[aIndexBuffer];
                aIndexBuffer++;
            }
        }
        return outSequence;
    }
}
