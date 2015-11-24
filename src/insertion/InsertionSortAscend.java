package insertion;

// Insertion Sort Method for Ascending Order

public class InsertionSortAscend {
    public static void insertionSortAscendingOrder(int[] array) {
        int i;
        int j;
        int newValue;

        for (i = 1; i < array.length; i++) {
            newValue = array[i];
            j = i;
            while (j > 0 && array[j - 1] > newValue) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = newValue;
        }
    }
}