package exchange;

// Exchange Sort Method for Ascending Order (integers)

public class ExchSortAscend {

    public static void exchangeSortAscendingOrder(int[] array) {
        int i;
        int j;
        int temp;

        for (i = 0; i < array.length - 1; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}