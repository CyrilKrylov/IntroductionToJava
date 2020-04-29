package by.epam.module01.onedimensional_array;

public class Task9 {

    public static int getDesiredNumber(int[] a) {
        int[] distinctArray = new int[a.length];
        int[] quantitiesArray = new int[a.length];
        distinctArray[0] = a[0];
        quantitiesArray[0] = 1;
        int insertedCount = 1;
        jump:
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < insertedCount; j++) {
                if (a[i] == distinctArray[j]) {
                    quantitiesArray[j]++;
                    continue jump;
                }
            }
            distinctArray[insertedCount] = a[i];
            insertedCount++;
        }
        int minOutValue = distinctArray[0];
        int maxOfQuantities = quantitiesArray[0];
        for (int i = 1; i < insertedCount; i++) {
            if (quantitiesArray[i] > maxOfQuantities) {
                maxOfQuantities = quantitiesArray[i];
                minOutValue = distinctArray[i];
            } else if (quantitiesArray[i] == maxOfQuantities) {
                if (minOutValue > distinctArray[i]) {
                    minOutValue = distinctArray[i];
                }
            }
        }
        return minOutValue;
    }
}
