package selection;

// Selection Sort Method for Descending Order

public class SelectionSortDescend {
    public static void selectionSortDescendingOrder(int[] array) {
        int i;
        int j;
        int n = array.length;
        int first;
        int temp;

        for (i = n - 1; i > 0; i--) {
            first = 0;
            for (j = 1; j <= i; j++) {
                if (array[j] < array[first]) {
                    first = j;
                }
                temp = array[first];
                array[first] = array[i];
                array[i] = temp;
            }
        }
    }
}
