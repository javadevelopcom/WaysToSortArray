package insertion;

// Insertion Sort Method for Descending Order

public class InsertionSortDescend {
    public static void insertionSortDescendingOrder(int[] array) {
        int i;
        int j;
        int newValue;

        for (i = 1; i < array.length; i++) {
            newValue = array[i];

            for (j = i - 1; (j >= 0) && (array[j] < newValue); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = newValue;
        }
    }
}